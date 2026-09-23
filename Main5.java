public class Main5 {
    public static void main(String[] args) {
        int[][] m = {
                {  5,  3, -2,  7,  1,  0,  4, -8},
                { -1,  6,  2, -5,  9,  3, -7,  2},
                {  0, -3,  4,  1, -6,  8,  5,  3},
                {  7,  2, -9,  0,  3, -1,  6,  4},
                { -4,  5,  1,  8,  2, -2,  7,  0},
                {  3, -6,  0, -3,  5,  1,  9, -5},
                {  8,  1, -1,  4, -8,  6,  2,  7},
                { -7,  2,  5,  0,  3, -4,  1,  9}
        };

        int count = 0;

        System.out.println("Локальные минимумы:");

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                int x = m[i][j];
                boolean isMin = true;

                // Проверяем верхнего соседа (если он есть)
                if (i > 0 && m[i - 1][j] <= x) isMin = false;
                // Нижнего
                if (i < 7 && m[i + 1][j] <= x) isMin = false;
                // Левого
                if (j > 0 && m[i][j - 1] <= x) isMin = false;
                // Правого
                if (j < 7 && m[i][j + 1] <= x) isMin = false;

                if (isMin) {
                    count++;
                    System.out.println("[" + i + "][" + j + "] = " + x);
                }
            }
        }

        System.out.println("Всего локальных минимумов: " + count);
    }
}