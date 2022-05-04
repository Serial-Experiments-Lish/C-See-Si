import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int numUno = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter another number:");
        int numDos = Integer.valueOf(scanner.nextLine());

        int addItUp = numUno + numDos;
        System.out.println(numUno + " + " + numDos + " = " + addItUp);

        int cutTheLosses = numUno - numDos;
        System.out.println(numUno + " - " + numDos + " = " + cutTheLosses);

        int multiplyAndConquer = numUno * numDos;
        System.out.println(numUno + " * " + numDos + " = " + multiplyAndConquer);

        double divideAndFall = (double)numUno / (double)numDos;
        System.out.println(numUno + " / " + numDos + " = " + divideAndFall);

        int morpheus = numUno % numDos;
        System.out.println(numUno + " % " + numDos + " = " + morpheus);
    }
}