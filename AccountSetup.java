import java.util.Scanner;
public class AccountSetup 
{
    public static void main(String[] args)
    {
        String name;
        String pass;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        name = input.nextLine();
        System.out.print("Enter your password: ");
        pass = input.nextLine();
        input.close();
        System.out.println("Your name is " + name);
        System.out.println("Your password is " + pass);
    }
}
