import java.util.Scanner;
class SumOfNumsInRange{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the start point:");
		int start=sc.nextInt();
		System.out.println("enter the end point:");
		int end=sc.nextInt();
		int sum=0;
		for(int i=start;i<=end;i++){
			sum=sum+i;
		}
		System.out.print("The sum of the numbers between "+start+" and "+end+" is "+sum);
	}
}