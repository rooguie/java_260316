package stockProgram;

import java.util.List;

public class graphDrawing<T extends DataFrame> {//dataframe계열만 허용.
//get int volume, int startPrice, int finishPrice, String year, String month 이것들 쓸려고.
	
    static final String RED = "\u001B[31m";
    static final String BLUE = "\u001B[34m";
    static final String RESET = "\u001B[0m";

    public void draw(List<T> list) {//데이터 받기.

        int n = list.size();
        int[] open = new int[n];
        int[] close = new int[n]; 
        //리스트는 느리다고 배열로 바꿔서 계산
        

        for (int i = 0; i < n; i++) {
            open[i] = list.get(i).getStartPrice();
            close[i] = list.get(i).getFinishPrice();
        }
        //숫자만 뽑아서 계산.

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        //최대 최소로 높이 계산.

        for (int i = 0; i < n; i++) {
            max = Math.max(max, Math.max(open[i], close[i]));
            min = Math.min(min, Math.min(open[i], close[i]));
        }
        //그래프 높이 범위 설정.

        int height = 15;
        double step = (double)(max - min) / height;
        //세로줄 20칸에 한칸당 가격 계산.

        for (int h = height; h >= 0; h--) {//그리기.

            double priceLine = min + step * h;
            //현재 줄 가격 위치.

            System.out.printf("%6.0f | ", priceLine);
            //%6.0f가 가격표시.

            for (int i = 0; i < n; i++) {

                int top = Math.max(open[i], close[i]);
                int bottom = Math.min(open[i], close[i]);
                //막대범위?
                
                boolean up = close[i] >= open[i];
                //색깔결정
                
                if (priceLine >= bottom && priceLine <= top) {
                    if (up) {
                        System.out.print(RED + "█  " + RESET);
                    } else {
                        System.out.print(BLUE + "█  " + RESET);
                    }
                } else {
                    System.out.print("   ");
                }
            }

            System.out.println();
        }

        // x축
        System.out.print("       ");
        for (int i = 0; i < n; i++) System.out.print("_____");
        System.out.println();

        // 월 표시
        System.out.print("        ");
        for (T d : list) {
            System.out.printf("%2s ", d.getMonth());
        }
    }
}