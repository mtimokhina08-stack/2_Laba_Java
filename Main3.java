public class Main3 {
    public static void main(String[] args) {
        double A = 0.0;    // начало диапазона
        double B = 2.0;    // конец диапазона
        double E = 0.5;    // шаг

        // Считаем количество точек
        int count = (int) Math.round((B - A) / E) + 1;

        // Создаем двумерный массив: 4 строки, count столбцов
        double[][] table = new double[4][count];

        // Заполняем таблицу
        double x = A;
        for (int i = 0; i < count; i++) {
            table[0][i] = x;
            table[1][i] = x * x - 10 * x + 15;
            table[2][i] = 2 * Math.sin(x + Math.PI / 3);
            table[3][i] = Math.exp(Math.sqrt(x));
            x += E;
        }

        // Выводим таблицу
        System.out.printf("%10s %15s %15s %15s%n", "x", "f1", "f2", "f3");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < count; i++) {
            System.out.printf("%10.3f %15.3f %15.3f %15.3f%n",
                    table[0][i], table[1][i], table[2][i], table[3][i]);
        }
    }
}
