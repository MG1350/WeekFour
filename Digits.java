public class Digits    
{
    public static void main (String[] args)
    {
        int num = 652;
        int ones = num % 10;
        int tens = num % 100 - ones;
        int hundreds = num % 1000 - tens - ones;
        int hund = 0;
        int tend = 0;
        while (hundreds != 0)
        {
            hundreds = hundreds - 100;
            hund = hund + +1;
        }
        while (tens != 0)
        {
            tens = tens - 10;
            tend = tend + +1;
        }
        System.out.println("The hundreds-place digit is: " + hund);
        System.out.println("The tens-place digit is: " + tend);
        System.out.println("The ones-place digit is: " + ones);

    }
}
