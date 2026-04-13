package stockProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class print_any {

    private int month;
    private int year;
    private String Investat;
    private int invest_money;

    private int startIndex; // ⭐ 투자 시작 위치
    private int a; // ⭐ 현재 index

    private List<DataFrame> allData;

    Scanner scan = new Scanner(System.in);

    // =========================
    // 시작
    // =========================
    public void printHighLowGraph() {

        System.out.println("확인하고싶은 주식입력");
        String name = scan.next();

        switch (name.toLowerCase()) {
            case "samsung":
                allData = new Samsung().samsung;
                break;
            case "skhynix":
                allData = new SkHynix().skhynix;
                break;
            default:
                System.out.println("종목 없음");
                return;
        }

        System.out.print("년도 입력 (예: 2023): ");
        String year = scan.next();

        System.out.print("월 입력 (1~12): ");
        String month = scan.next();

        int targetIndex = findIndex(year, month);

        if (targetIndex == -1) {
            System.out.println("해당 날짜 없음");
            return;
        }

        if (targetIndex < 11) {
            System.out.println("1년치 데이터 부족");
            return;
        }

        a = targetIndex;
        startIndex = targetIndex; // ⭐ 투자 시작 저장

        System.out.println("주가 상하폭");
        drawGraph(a);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("거래량 그래프 VVVVV");
        VolumeGraph(a);
        asking_keep_go();
    }

    // =========================
    // index 찾기
    // =========================
    private int findIndex(String year, String month) {
        for (int i = 0; i < allData.size(); i++) {
            DataFrame d = allData.get(i);

            if (d.getYear().equals(year) && d.getMonth().equals(month)) {
                return i;
            }
        }
        return -1;
    }

    // =========================
    // 그래프 출력
    // =========================
    private void drawGraph(int endIndex) {

        List<DataFrame> oneYearData = new ArrayList<>();

        for (int i = endIndex - 11; i <= endIndex; i++) {
            oneYearData.add(allData.get(i));
        }

        graphDrawing<DataFrame> gd = new graphDrawing<>();
        gd.draw(oneYearData);
    }
    
    //======================================
    private void VolumeGraph(int endIndex) {

        List<DataFrame> oneYearData2 = new ArrayList<>();

        for (int i = endIndex - 11; i <= endIndex; i++) {
            oneYearData2.add(allData.get(i));
        }

        VolumeGraph<DataFrame> vg = new VolumeGraph<>();
        vg.draw(oneYearData2);
    }
    
    
    
    
    
    //==================================

    // =========================
    // 메인 투자 루프
    // =========================
    public void asking_keep_go() {

        System.out.println("\n이번 구간 투자하시겠습니까? (yes / no)");
        String input = scan.next();

        boolean invested = false;

        if (input.equals("yes")) {
            System.out.print("투자 금액 입력: ");
            invest_money = scan.nextInt();

            System.out.println("투자 완료! 금액: " + invest_money);
            invested = true;
        }

        while (true) {

            System.out.println("\n다음 달로 이동하시겠습니까? (yes / no)");
            String input1 = scan.next();

            if (input1.equals("yes")) {

                if (a + 1 >= allData.size()) {
                    System.out.println("더 이상 데이터 없음");
                    break;
                }

                a++;
                System.out.println("주가 상하폭");
                drawGraph(a);
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("거래량 그래프 VVVVV");
                VolumeGraph(a);

                // 투자 유지 질문
                if (invested) {
                    System.out.println("\n투자 유지하시겠습니까? (yes / no)");
                    String keep = scan.next();

                    if (keep.equals("no")) {

                        System.out.println("\n=== SELL 실행 ===");
                        sell(startIndex, a, allData, invest_money);

                        invested = false;
                    }
                }

            } else if (input1.equals("no")) {

                System.out.println("\n강제 종료 → SELL 실행");

                if (invested) {
                    sell(startIndex, a, allData, invest_money);
                }

                break;

            } else {
                System.out.println("잘못된 입력");
            }
        }
    }

    // ================================================================================
    // SELL
    // ===================================================
    public void sell(int startIndex, int sellIndex, List<DataFrame> allData, int investMoney) {

        int startPrice = allData.get(startIndex).getFinishPrice();
        //시작 인덱스의 종가에 구매로 취급.
        

        int sellPrice;

        if (sellIndex + 1 < allData.size()) { 
        	//다음달 시가에 팔기로 했음.(그래야 억까도 존재함.
        	//sellindex 는 그냥 어디서 받아오는 값.
        	//이 코드에선 a 로 선언되어있음. 
        	//상단부  ""private int a; // ⭐ 현재 index"" 참고
        	//startindex도 밖에 private으로 선언되어있음.
            sellPrice = allData.get(sellIndex + 1).getStartPrice();
            
        } else {
            System.out.println("판매 불가 (다음 달 없음)");
            return;
        }

        double rate = (double)(sellPrice - startPrice) / startPrice;
        int resultMoney = (int)(investMoney * (1 + rate));
        printResult(startPrice,sellPrice,rate,resultMoney);

//        System.out.println("\n==== 투자 결과 ====");
//        System.out.println("시작 종가: " + startPrice);
//        System.out.println("판매 시가: " + sellPrice);
//        System.out.println("수익률: " + (rate * 100) + "%");
//        System.out.println("최종 금액: " + resultMoney);
    }

    // =========================
    // UI
    // =========================
    public void printResult(int startPrice, int sellPrice, double rate, int resultMoney) {
    	 System.out.println("\n==== 투자 결과 ====");
         System.out.println("시작 종가: " + startPrice);
         System.out.println("판매 시가: " + sellPrice);
         System.out.println("수익률: " + (rate * 100) + "%");
         System.out.println("최종 금액: " + resultMoney);
    	
    }
    public void starting() {
        System.out.println("|==========================================================");
        System.out.println("|      STOCK SIMULATION                                   |");
        System.out.println("|==========================================================");
    }

    public void hwamyeon_clear() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
