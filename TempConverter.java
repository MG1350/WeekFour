import java.util.Scanner;
public class TempConverter 
{
    public static void main(String[] args) 
    {
        int far;
        double cel;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Temperature In Fahrenheit: ");
        far = input.nextInt();
        input.close();
        cel = ((far-32)*5)/9; 
        System.out.println("Celsius: " + cel);
    }
}
