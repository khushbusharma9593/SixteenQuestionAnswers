import java.util.Scanner;

public class GrossSalary
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
       //BasicSalary basicSalary=new basicsalary;
        System.out.println("Enter the employee ID");
        int empID=scanner.nextInt();

        System.out.println("Enter the employee name");
        String name=scanner.next();

        System.out.println("Enter basic salary");
        double amount=scanner.nextDouble();

        double HRA = amount*10/100;
        System.out.println("Calculate HRA "+ HRA);

        double DA=amount*8/100;
        System.out.println("Calculate DA "+ DA);

        double TA=amount*9/100;
        System.out.println("Calculate TA "+ TA);

        double PF =amount*20/100;
        System.out.println("Calculate PF "+ PF);

        double Grosssalary=amount+HRA+DA+TA-PF;
        System.out.println("Gross Salary Received "+ Grosssalary);


        }


    }















