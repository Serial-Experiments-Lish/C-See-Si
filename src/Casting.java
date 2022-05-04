public class Casting {
    public static void main(String[] args) throws Exception {
        double cheeseburger = 112.35;
        int teger = (int)cheeseburger;
        
        System.out.println("Double: " + cheeseburger);
        System.out.println("int: " + teger);

        String cheese = "49";
        int telligence = Integer.parseInt(cheese);

        System.out.println("The string value is: " + cheese);
        System.out.println("The integer value is: " + telligence);
    }
}
