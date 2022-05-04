import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word:");
        String aling = scanner.nextLine();
        System.out.println("Enter another word:");
        String yoyo = scanner.nextLine();

        if (aling.equals(yoyo)) {
            System.out.println("The words are the same");
        } else {
            System.out.println("The words are different");
        }
    }
}