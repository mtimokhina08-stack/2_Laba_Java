public class Main8 {
    public static void main(String[] args) {
        int[] temp = {-2, -5, -2, -4, 3, -6, -2, -1, 5, 1, 1,
                0, -1, 0, 3, -1, 2, 5, 2, 4, 4, 0, 6, 1, 4, 6, -1, 2, 4, 7, 11};
        
        int changes = 0;
        for (int i = 1; i < temp.length; i++) {
            if (temp[i - 1] < 0 && temp[i] > 0) {
                changes++;
            }
        }
        System.out.println("Смен 'минус → плюс': " + changes);

        int maxStreak = 0;
        int currentStreak = 0;
        for (int t : temp) {
            if (t > 0) {
                currentStreak++;
                if (currentStreak > maxStreak) {
                    maxStreak = currentStreak;
                }
            } else {
                currentStreak = 0;
            }
        }
        System.out.println("Максимум дней подряд с плюсом: " + maxStreak);

        System.out.println("\nГрафик:");
        for (int t : temp) {
            if (t >= 0) {
                for (int j = 0; j < 10; j++) System.out.print(" ");
                System.out.print("|");
                for (int j = 0; j < t; j++) System.out.print("█");
            } else {
                for (int j = 0; j < 10 + t; j++) System.out.print(" ");
                for (int j = 0; j < -t; j++) System.out.print("█");
                System.out.print("|");
            }
            System.out.println(" " + t);
        }

    }
}
