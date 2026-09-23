import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {
        int size = 1_000_000;
        String[] source = new String[size];

        // Заполняем исходный массив
        for (int i = 0; i < size; i++) {
            source[i] = "Строка №" + i;
        }

        // --- 1. Ручное копирование через цикл ---
        String[] copy1 = new String[size];
        long start1 = System.nanoTime();
        for (int i = 0; i < size; i++) {
            copy1[i] = source[i];
        }
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        // --- 2. Копирование через System.arraycopy ---
        String[] copy2 = new String[size];
        long start2 = System.nanoTime();
        System.arraycopy(source, 0, copy2, 0, size);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        // --- 3. Копирование через Arrays.copyOf ---
        long start3 = System.nanoTime();
        String[] copy3 = Arrays.copyOf(source, size);
        long end3 = System.nanoTime();
        long time3 = end3 - start3;

        // --- Вывод результатов ---
        System.out.println("Ручное копирование:      " + time1 + " нс");
        System.out.println("System.arraycopy:        " + time2 + " нс");
        System.out.println("Arrays.copyOf:           " + time3 + " нс");
    }
}
