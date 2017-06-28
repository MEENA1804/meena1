import java.io.*;
import java.util.*;
public class Power {
	public static void main(String[] args) {
int num;
int power;
Scanner input=new Scanner(System.in);
System.out.println("enter the input");
num=input.nextInt();
System.out.println("enter the power input");
power=input.nextInt();
	double p=Math.pow(num,power);
	System.out.println("the output is"+p);

	}

}
