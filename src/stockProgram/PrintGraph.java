package stockProgram;

import java.util.ArrayList;
import java.util.List;

public class PrintGraph {

    private int startIndex;
    private int currentIndex;

    private List<DataFrame> Data;
    
    public int getCurrentIndex() {
        return currentIndex;
    }
    
    //메인 실행
    public void printGraph(List<DataFrame> data, String year, String month) {

        this.Data = data;

        int targetIndex = findIndex(year, month);

        if (targetIndex == -1) {
            System.out.println("해당 날짜 없음");
            return;
        }

        if (targetIndex < 11) {
            System.out.println("1년치 데이터 부족");
            return;
        }

        currentIndex = targetIndex;
        startIndex = targetIndex;

        printAllGraphs();
    }


    
    // 그래프 묶어서 출력
    private void printAllGraphs() {

        System.out.println("\n주가 그래프");
        drawPriceGraph(currentIndex);

        System.out.println("\n거래량 그래프");
        drawVolumeGraph(currentIndex);
    }

    // ===============datalist에서 year month 를 맞게 가진게 몇번째인지
    private int findIndex(String year, String month) {
        for (int i = 0; i < Data.size(); i++) {
            DataFrame d = Data.get(i);

            if (d.getYear().equals(year) && d.getMonth().equals(month)) {
                return i;
            }
        }
        return -1;
    }
    
    
    
    // 주가 그래프
    private void drawPriceGraph(int endIndex) {

        List<DataFrame> list = new ArrayList<>();

        for (int i = endIndex - 11; i <= endIndex; i++) {
            list.add(Data.get(i));
        }

        graphDrawing<DataFrame> gd = new graphDrawing<>();
        gd.draw(list);
    }
    
    
    
    // 거래량 그래프
    private void drawVolumeGraph(int endIndex) {

        List<DataFrame> list = new ArrayList<>();

        for (int i = endIndex - 11; i <= endIndex; i++) {
            list.add(Data.get(i));
        }

        VolumeGraph<DataFrame> vg = new VolumeGraph<>();
        vg.draw(list);
    }
    
    
    
    // 다음 달 이동
    public void nextMonth() {

        if (currentIndex + 1 >= Data.size()) {
            System.out.println("더 이상 데이터 없음");
            return;
        }

        currentIndex++;
        printAllGraphs();
    }
    
    
    
	 //상태 초기화
	 public void reset() {
	     startIndex = 0;
	     currentIndex = 0;
	
	     Data = null;
	
	     System.out.println("\n[RESET 완료] 새로운 종목/시뮬레이션 시작 가능");
	 }

    
    
    
    // SELL
    public void sell(int investMoney) {

        int startPrice = Data.get(startIndex).getFinishPrice();
        int sellPrice = Data.get(currentIndex + 1).getStartPrice();

        double rate = (double)(sellPrice - startPrice) / startPrice;
        int resultMoney = (int)(investMoney * (1 + rate));

        System.out.println("\n===== 투자 결과 =====");
        System.out.println("시작 종가: " + startPrice);
        System.out.println("판매 시가: " + sellPrice);
        System.out.println("수익률: " + (rate * 100) + "%");
        System.out.println("최종 금액: " + resultMoney);
    }
}