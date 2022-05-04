import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int teresting = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter another number:");
        int terrogation = Integer.valueOf(scanner.nextLine());

        if (teresting == terrogation) {
            System.out.println("Numbers are the same");
        } else if (teresting > terrogation) {
            System.out.println("The first number was larger than the second");
        } else {
            System.out.println("The second number was larger than the first");
        }
    }
}