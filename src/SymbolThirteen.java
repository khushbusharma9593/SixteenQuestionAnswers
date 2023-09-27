public class SymbolThirteen
{
    public static void main(String[] args)//main method
    { char symbol='+';//variable declared
        int a=15;
        int b=10;

        switch (symbol)//using variable in bracket
        {case '+':
            System.out.println("Addition of "+a+ " and "+b +"="+ (a+b));
            break;
            case '-':
                System.out.println("Substraction of" +a+ "and" +b+"="+ (a-b));
                break;
            case '*':
                System.out.println("Multiplication of" +a+ "and" +b+"="+ (a*b));
                break;
            case '/':
                System.out.println("Division of" +a+ "and" +b+"="+ (a/b));
                break;


        }


    }
}
