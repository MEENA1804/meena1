public class PrimeInterval{
	public static void main(String ar[]){
		int i,j;
		int flag=0;
		for(i=10;i<=99;i++){
			for(j=2;j<=i/2;j++){
				if(i%j==0){
					flag=1;
					break;
				}
			}
			if(flag==0){
				System.out.println("Prime :"+i);
			}
			flag=0;
		}
	}
}
