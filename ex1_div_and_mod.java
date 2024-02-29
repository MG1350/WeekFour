import java.util.Scanner;
public class ex1_div_and_mod 
{
    public static void main(String[] args)
    {
        int name;
        int pass;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        name = input.nextInt();
        System.out.print("Enter a second integer: ");
        pass = input.nextInt();
        input.close();
        System.out.println(name + " / " + pass + " = " + (name/pass) );
        System.out.println(name + " % " + pass + " = " + (name%pass) );
        System.out.println("");
        System.out.println(pass + " / " + name + " = " + (pass/name) );
        System.out.println(pass + " % " + name + " = " + (pass%name) );
    }
}
