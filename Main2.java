public class Main2 {
    public static void main(String[] args) {
        int[] arr = {121, 565, 111, 45, 8, 909, 400, 787, 55,
                202, 999, 12, 350, 606, 4, 313, 77, 8, 300};

        int maxi = -1;

        for (int num : arr) {

            if (num % 2 == 0) {
                if (num > maxi) {
                    maxi = num;
                }
            }
        }

        System.out.println("Максимальное четное число: " + maxi);
    }
}