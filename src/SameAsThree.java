import java.util.Scanner;

public class SameAsThree {
    public static void main(String[] args) //main method
    {
        Scanner scanner = new Scanner(System.in);//making object
        System.out.println("Please enter Student's Name");
        String name = scanner.next();

        System.out.println("PLease enter Roll number in digits");
        int rollnumber = scanner.nextInt();

        System.out.println("Please enter Math's marks");
        int Math = scanner.nextInt();

        System.out.println("Please enter English's marks");
        int English = scanner.nextInt();

        System.out.println("Please enter Science's marks");
        int Science = scanner.nextInt();

        int total = Math + English + Science;
        System.out.println("TOTAL MARKS " + total);

        double perc = total / 3;
        System.out.println("PERCENTAGE " + perc);

        if (perc >= 80) {
            System.out.println("A+ grade");
        } else if (perc >= 60) {
            System.out.println("A grade");

        } else if (perc >= 50) {
            System.out.println("B grade");
        } else if (perc >= 35) {
            System.out.println("C grade");
        } else {
            System.out.println("Fail");
        }

    }

}

