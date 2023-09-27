import java.util.Scanner;

public class SalesCommission {
 public static void main(String[] args) //main method
 {
  Scanner scanner = new Scanner(System.in);//making object

  System.out.println("Enter sales ID");
  String salesID = scanner.next();

  System.out.println("Enter seller's name");
  String name = scanner.next();

  System.out.println("Enter sales amount");
  double salesamount = scanner.nextDouble();

  System.out.println("Enter salary basic");
  double salarybasic = scanner.nextDouble();

  if (salesamount >= 50000 + 35 / 100) {
   System.out.println("Sales commission is excellent");

  } else if (salesamount >= 30000 + 20 / 100) {
   System.out.println("Sales commission is good");

  } else if (salesamount >= 20000 + 10 / 100) {
   System.out.println("Sales commisiion is average");
  } else if (salesamount >= 10000 + 5 / 100) {
   System.out.println("Sales commission is not good");
  } else {
   System.out.println("No Sales commission");
  }
 }
}
