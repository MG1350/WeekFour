public class Digits    
{
    public static void main (String[] args)
    {
        int num = 258;
        int ones = num % 10;
        int tens = num % 100 - ones;
        int hundreds = num % 1000 - tens - ones;
        System.out.println("The hundreds-place digit is: " + hundreds);
        System.out.println("The tens-place digit is: " + tens);
        System.out.println("The ones-place digit is: " + ones);

    }
}
