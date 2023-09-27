import java.util.Scanner;

public class InterchangedValue
{
    static void swappingvalueusingThirdVariable(int x, int y)  // Using temporary variable

    {
        int temp=x; // Swapping the values
        x=y;
        y=temp;
        System.out.println("value of x is "+ x +" value of y is " +y );
    }

    public static void main(String [] args)
    {
        int x = 5;
        int y = 10;

         swappingvalueusingThirdVariable( x,  y);  // Calling above function to reverse the numbers

    }
}
