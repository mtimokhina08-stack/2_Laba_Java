import java.util.Arrays;
public class Main4 {
    public static void main(String[] args) {
        int[] arr = {13, 45, 23, 100, 3, 56, 53, 78, 83, 90,
                33, 12, 43, 1000, 63, 7, 73, 21, 93, 8};

        int count = 0;
        for (int num : arr) {
            if (num % 10 == 3) count++;
        }

        int[] result = new int[count];

        int index = 0;
        for (int num : arr) {
            if (num % 10 == 3) {
                result[index] = num;
                index++;
            }
        }

        Arrays.sort(result);

        for (int i = 0; i < result.length / 2; i++) {
            int temp = result[i];
            result[i] = result[result.length - 1 - i];
            result[result.length - 1 - i] = temp;
        }

        System.out.print("Новый массив: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
