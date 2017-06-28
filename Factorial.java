package meena;
import java.io.*;
import java.util.*;
public class Factorial {
	public static void main(String[] args) {
	int num;
	int fact=1;
	Scanner input=new Scanner(System.in);
	System.out.println("enter the input");
	num=input.nextInt();
	for(int i=1;i<=num;i++)
	{
		fact=fact*i;
	}
System.out.println("the factorial of the number is "+fact);
	}
}
