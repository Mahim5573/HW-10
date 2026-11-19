public class Task3 {

    public static int sumDigits(int x) {

        if (x == 0) {
            return 0;
        }

        return (x % 10) + sumDigits(x / 10);
    }

    public static void main(String[] args) {

        int number = 1342;

        System.out.println("Sum of Digits: " +
                sumDigits(number));
    }
}