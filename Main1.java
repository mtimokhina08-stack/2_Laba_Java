public class Main1 {
    public static void main(String[] args) {
        int[] arr = {121, 565, 111, 45, 8, 1000, 909, 400, 787, 55,
                202, 999, 12, 350, 606, 4, 313, 77, 8, 300};

        int count = 0;
        int sum = 0;

        for (int num : arr) {
            if (num >= 100 && num <= 999) {
                int first = num / 100;
                int last = num % 10;

                if (first == last) {
                    count++;
                    sum += num;
                }
            }
        }

        System.out.println("Количество симметричных чисел: " + count);
        System.out.println("Сумма симметричных чисел: " + sum);
    }
}