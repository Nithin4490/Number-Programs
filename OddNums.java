import java.util.Scanner;
class OddNums{
	public static void main(String[]args){
		Scanner odd=new Scanner(System.in);
		System.out.println("Enter the starting number:");
		int Start=odd.nextInt();
		System.out.println("Enter the ending number:");
		int End=odd.nextInt();
		System.out.println("The odd numbers in the range" +Start+ "and" +End+ "is :");
		for(int i=Start;i<=End;i++){
			if(i%2==1){
				System.out.println(i+" ");
			}
		}
	}
}