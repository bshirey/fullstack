package moddigits;

public class moddigits {
    public static void main(String args[])
    {
        int value = 1234;
        int sumOfDigits = 0;

        while (value > 0)
        {
            sumOfDigits += value % 10;
            value /= 10;
        }

        System.out.println("Sum is " + sumOfDigits);
    }
}
