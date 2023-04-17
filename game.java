import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rc = new Random();
        System.out.println("Enter your name :");
        String name = sc.nextLine();
        for (int i = 0;; i++) {
            System.out.println("Choose any one!! stone=0 paper=1 scissor=2");
            int num = sc.nextInt();
            int num1 = rc.nextInt(3);
            if (num == 0 && num1 == 0) {
                System.out.println("Match tie");
            } else if (num == 0 && num1 == 1) {
                System.out.println("System won the match");
            } else if (num == 0 && num1 == 2) {
                System.out.println(name + " won the match");
            } else if (num == 1 && num1 == 0) {
                System.out.println(name + " won the match");
            } else if (num == 1 && num1 == 1) {
                System.out.println("Match tie");
            } else if (num == 1 && num1 == 2) {
                System.out.println("System won the match");
            } else if (num == 2 && num1 == 0) {
                System.out.println("System won the match");
            } else if (num == 2 && num1 == 1) {
                System.out.println(name + " won the match");
            } else if (num == 2 && num1 == 2) {
                System.out.println("Match tie");
            }

        }
    }
}
