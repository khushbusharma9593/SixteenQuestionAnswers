import java.util.Scanner;

public class OddEven
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//make a new object to call
        System.out.println("Enter your first number");
        int numberone = scanner.nextInt();

        String evenOrOdd = (numberone % 2 == 0) ? "even" : "odd";//using ternary operator

        System.out.println("The given number is " + evenOrOdd);

        System.out.println("Enter your second number");
        int numbertwo = scanner.nextInt();

        String evenOdd = (numbertwo % 2 == 0) ? "even" : "odd";
        System.out.println("The given number is " + evenOdd);


    }


    }






