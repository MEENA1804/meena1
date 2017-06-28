package meena;
import java.io.*;
import java.util.*;
public class Arm {
	public static void main(String[] args) {
	int number;
	int rem=0;
	Scanner input=new Scanner(System.in);
	System.out.println("enter the input");
	number=input.nextInt();
	int no=number;
	while(number>0)
	{
		int temp=number%10;
		number=number/10;
		rem=rem+temp*temp*temp;
	}
	if(rem==no)
	{
		System.out.println("the output is an armstrong number");
	}
	else
	{
		System.out.println("the output is not an armstrong number");
	}
	}

}
