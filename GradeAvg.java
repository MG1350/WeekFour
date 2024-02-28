import java.util.Scanner;
public class GradeAvg 
{
    public static void main(String[] args) 
    {
        int grade1;
        int grade2;
        int grade3;
        int grade4;
        int grade5;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Grade: ");
        grade1 = input.nextInt();
        System.out.print("Enter A Grade: ");
        grade2 = input.nextInt();
        System.out.print("Enter A Grade: ");
        grade3 = input.nextInt();
        System.out.print("Enter A Grade: ");
        grade4 = input.nextInt();
        System.out.print("Enter A Grade: ");
        grade5 = input.nextInt();   
        input.close();
        double gradeAvg = (grade1 + grade2 + grade3 + grade4+ grade5)/5;
        System.out.println("Average: " + gradeAvg);
    }
}
