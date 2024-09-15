import java.util.Scanner;
class EvenNums{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start point:");
		int start=sc.nextInt();
		System.out.println("Enter the end point:");
		int end=sc.nextInt();
		System.out.println("The Even Numbers between "+ start+" and "+ end+" is :");
		for(int i=start;i<=end;i++){
			if(i%2==0){
				System.out.print(i+" ");
			}
		}
	}
}