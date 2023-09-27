import java.util.Scanner;

public class FindAverage
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter first number");
        double numberone=scanner.nextDouble();

        System.out.println("Enter second number");
        double numbertwo=scanner.nextDouble();

        System.out.println("Enter third number");
        double numberthree= scanner.nextDouble();

        System.out.println("Enter fourth number");
        double numberfour=scanner.nextDouble();

        System.out.println("Enter five number");
        double numberfive= scanner.nextDouble();

        double average=numberone+numbertwo+numberthree+numberfour+numberfive/5;
        System.out.println("Calculate average of five numbers "+ average);










    }

}
