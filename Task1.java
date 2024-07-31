import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();

        int rand_num1 = rand.nextInt(100);
        System.out.println("random number: " + rand_num1);

        int attempt = 0;
        int trial = 0;
        int score = 10;
        
        while(attempt < 10) {
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();

            int diff = Math.abs(num - rand_num1);

            trial += 1;

            if (diff >= 50) {
                System.out.println("too high");
            } else if (diff >= 30) {
                System.out.println("high");
            } else if (diff >= 20) {
                System.out.println("close");
            } else if (diff >= 10) {
                System.out.println("too close");
            } else if (diff >= 1) {
                System.out.println("almost there");
            } else if (diff == 0) {
                System.out.println("you got it");
                break;
            } score -= 1;
            attempt++;
        }

        System.out.println("No. of attempts: " + trial);
        System.out.println("Score: " + score);
    }
}