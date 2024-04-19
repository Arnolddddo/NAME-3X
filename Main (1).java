import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What is 10 - 10?");
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();

        while (count < 3) {
            System.out.println("Arnoldo");
            count++;
        }
    }
}