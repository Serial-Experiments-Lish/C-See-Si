import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 100");
        int terlope = Integer.valueOf(scanner.nextLine());

        if (terlope >= 90 && terlope <= 100) {
            System.out.println("Your grade is an A *cough* nerd ;]");
        } else if (terlope >= 80 && terlope <= 89) {
            System.out.println("Your grade is a B for doBETTER >:o");
        } else if (terlope >= 70 && terlope <= 79) {
            System.out.println("Your grade is a C for Christ didn't die for this grade <.<");
        } else if (terlope >= 65 && terlope <= 69) {
            System.out.println("Your grade is a D for D-E-N-S-E");
        } else if (terlope >= 0 && terlope < 65) {
            System.out.println("Your grade is an F for Fling your intelligence out of my sight ;-; Shoo!");
        } else if (terlope < 0 || terlope > 100) {
            System.out.println("I didn't think you'd actually do it.  You thought I wouldn't account for this?  You flunk life.  BEGONE!!! 1010001110010 -- 00ps, caused me to glitch out for a sec.");
        }
    }
}