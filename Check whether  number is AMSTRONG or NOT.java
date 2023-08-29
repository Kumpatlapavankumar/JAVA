import java.util.Scanner;
class amstrong{
public static void main(String[] args){
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int num=n;
		int sum=0;
		while(n!=0){
			int digit=n%10;
			sum=sum+(digit*digit*digit);
			n=n/10;
		}
		if(num==sum){
			System.out.println("Amstrong");
		}else{
			System.out.println("Not Amstrong");
		}
	}
}
