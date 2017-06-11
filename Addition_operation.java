// Write a program to print the sum of two numbers without using + operator. Other operators have
//to be used.
//Note: Take care of CamelCase naming conventions.


package question_1_2;


import java.util.Scanner;

public class Addition_operation 
{
	//int x = 10, y = 5, i;
	static int add(int x, int y)
    {
        int carry;
        while(y!=0)
        {
            carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        return x;
    }
     


	public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("The numbers to be added are: ");
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println("The Summation is: "+add(x, y));
        input.close();
    }

	@SuppressWarnings("unused")
	private static String add1(final int x, final int y) {
		return null;
	}
}