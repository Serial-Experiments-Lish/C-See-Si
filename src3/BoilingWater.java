import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number greater than 212°:");
        int degreez = Integer.valueOf(scanner.nextLine());

        if (degreez > 212) {
            System.out.println("Water is boiling!");
        } else {
            System.out.println("Dense like ice, are we?");
        }
    }
}