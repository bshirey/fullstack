package methods;

public class methods {
    public static void main(String args[])
    {
        System.out.println("Is 7 prime? " + IsPrime(7));
        System.out.println("Is 25 prime? " + IsPrime(25));
        System.out.println("Is 7.2 prime? " + IsPrime(7.2f));
        System.out.println("Is 49.0 prime? " + IsPrime(49.0f));
    }

    public static boolean IsPrime(int num)
    {
        for (int i = 2; i < (num / 2); i++)
        {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static boolean IsPrime(float num)
    {
        return IsPrime((int)num);
    }
}
