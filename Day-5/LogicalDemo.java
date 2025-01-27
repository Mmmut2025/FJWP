import java.util.Scanner;
class LogicalDemo{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter three values:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		boolean result = a > b && a > c;

		System.out.println("A is greater:" +  result);

		System.out.println("b is greater :" + (b > a && b > c));

		System.out.println("c is greater :" + (c > a && c > b));

	
	}
}