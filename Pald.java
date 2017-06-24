package meena1;
import java.util.*;
public class Pald {
	public static void main(String args[]){
		if(args.length!=0){
			int a=Integer.parseInt(args[0]),sum=0;
			int b=a,d;
			while(b!=0){
				d=b%10;
				sum=sum*10+d;
				b=b/10;
			}
			if(a==sum){
				System.out.println(a+" is a palindrome");
			}
			else{
				System.out.println(a+" is not a palindrome");
			}
		}
		else{
			System.out.println("Enter the Integer");
		}
	}
}
