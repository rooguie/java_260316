package stockProgram;

import java.util.List;

public class VolumeGraph<T extends DataFrame> {

    static final String RED = "\u001B[31m";
    static final String BLUE = "\u001B[34m";
    static final String RESET = "\u001B[0m";

    public void draw(List<T> list) {

        int n = list.size();

        int[] volume = new int[n];
        int[] open = new int[n];
        int[] close = new int[n];

        // =========================
        // 데이터 추출
        // =========================
        for (int i = 0; i < n; i++) {
            volume[i] = list.get(i).getVolume();
            open[i] = list.get(i).getStartPrice();
            close[i] = list.get(i).getFinishPrice();
        }

        // =========================
        // MAX만 찾고 MIN은 0 고정
        // =========================
        int max = volume[0];

        for (int i = 1; i < n; i++) {
            if (volume[i] > max) {
                max = volume[i];
            }
        }

        int min = 0;

        // =========================
        // 스케일 설정
        // =========================
        int height = 15;
        double step = (double)(max - min) / height;

        // =========================
        // 그래프 출력
        // =========================
        for (int h = height; h >= 0; h--) {

            double line = min + step * h;

            System.out.printf("%10.0f | ", line);

            for (int i = 0; i < n; i++) {

                boolean isUp = close[i] >= open[i];

                if (volume[i] >= line) {

                    if (isUp) {
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

        // =========================
        // x축
        // =========================
        System.out.print("           ");
        for (int i = 0; i < n; i++) System.out.print("___");
        System.out.println();

        // =========================
        // 월 표시
        // =========================
        System.out.print("            ");
        for (T d : list) {
            System.out.printf("%2s ", d.getMonth());
        }

        System.out.println();
    }
}
