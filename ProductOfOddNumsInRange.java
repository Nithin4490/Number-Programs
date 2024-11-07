import java.util.Scanner;
class ProductOfOddNumsInRange{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start point:");
		int start=sc.nextInt();
		System.out.println("Enter the end point:");
		int end=sc.nextInt();
		int product=1;
		for (int i=start;i<=end;i++){
			if(i%2!=0){
				product=product*i;
			}
		}
		System.out.print("the product of the odd numbers between "+start+" and "+end+" is "+product);
	}
}