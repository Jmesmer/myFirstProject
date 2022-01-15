/*This program demonstrates how to use recursion to create a method
* that calculates the factorials of numbers.  The main method stores
* values into 3 separate integers and the factorial method is called
* to determine what the factorial is of the three numbers.  An exception
* is thrown when a negative number is called to the factorial method, and the
* values returned by the factorial method are in scientific notation to reduce
* processing power requirements.*/

public class Recursion {

    public static void main(String[] args) {
        //creates three doubles to call in the factorial method
        double num1 = 12;
        double num2 = 25;
        double num3 = -5;
        //calls the factorial method and stores the value of num1's factorial
        double factorial1 = factorial(num1);
        //prints the value of the factorial of num1
        System.out.println("The product of the first fatorial is " + factorial1);

        //calls the factorial method and stores the value of num2's factorial
        double factorial2 = factorial(num2);
        //prints the value of the factorial of num2
        System.out.println("The product of the second fatorial is " + factorial2);

        //calls the factorial method and stores the value of num3's factorial
        double factorial3 = factorial(num3);
        //prints the value of the factorial of num3
        System.out.println("The product of the third fatorial is " + factorial3);

    }
//creates the factorial method that returns a double and takes in a double.
    public static double factorial (double x)
    {
        //if the called value is a negative number, then throw an error exception
        if (x < 0)
        {
            throw new IllegalArgumentException("Error, cannot compute the factorial of a negative number.");
        }
        //if the called value is 1 or more, then calculate the factorial using the recursive method
        if (x >= 1)
        {
            return x * factorial(x - 1);

        }
        //if the called value is 0, return 1
        else
            return 1;
    }

}


