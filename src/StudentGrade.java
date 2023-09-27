import javax.print.DocFlavor;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) //main method
    {
        Scanner scanner = new Scanner(System.in);//make a new object to call
        System.out.println("Please enter Student's Name");
        String name = scanner.nextLine();

        System.out.println("PLease enter Roll number in digits");
        int rollnumber = scanner.nextInt();

        System.out.println("Please enter Math's marks");
        int Maths= scanner.nextInt();

        System.out.println("Please enter English's marks");
        int English = scanner.nextInt();

        System.out.println("Please enter Science's marks");
        int Science = scanner.nextInt();

        int total = Maths+English+Science;
        System.out.println("TOTAL MARKS " + total);

        double perc = total/3;
        System.out.println("PERCENTAGE "+ perc);


        if (perc>=80)
        {
            System.out.println("A+ grade");

        }else if (perc>=60)
        {
            System.out.println("A Grade");
        } else if (perc>=50)
        {
            System.out.println("B Grade");
            
        }else if (perc>=35)
        {
            System.out.println("C Grade");
        }else
        {
            System.out.println("Fail");

        }



    }
}