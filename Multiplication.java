package meena;
import java.io.*;
import java.util.*;
public class Multiplication {
	public static void main(String[] args) {
		int number;
		int table=1;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number");
		number=input.nextInt();
		System.out.println("ente the mul number");
		int mul=input.nextInt();
		for(int i=1;i<=number;i++)
		{
			 table=i*mul;
		
System.out.println("the output is"+table);
	}
	}
}
