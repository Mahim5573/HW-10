public class Task1 {

    public static int calculateArea(int length, int width) {
        return length * width;
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {

        System.out.println("Integer Area: " +
                calculateArea(10, 5));

        System.out.println("Double Area: " +
                calculateArea(10.5, 5.5));
    }
}