import java.util.Random;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int players = sc.nextInt();

        if (players * 5 > 52) {
            System.out.println("Слишком много игроков! Максимум 10.");
            return;
        }

        String[] suits = {"♠", "♥", "♦", "♣"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        String[] deck = new String[52];
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                deck[k] = ranks[j] + suits[i];
                k++;
            }
        }

        Random rand = new Random();
        for (int i = 0; i < 52; i++) {
            int j = rand.nextInt(52);
            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }

        int index = 0;
        for (int p = 0; p < players; p++) {
            System.out.print("Игрок " + (p + 1) + ": ");
            for (int c = 0; c < 5; c++) {
                System.out.print(deck[index] + " ");
                index++;
            }
            System.out.println();
        }
    }
}