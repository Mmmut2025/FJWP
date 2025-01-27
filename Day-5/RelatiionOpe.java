import java.util.Scanner;
class RelationOpe{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter two values:");
		int a = sc.nextInt();
		int b = sc.nextInt();


		System.out.println("a is less than b :" + (a < b));

		
		System.out.println("a is less than or equal to b :" + (a <= b));

		System.out.println("a is greater than b :" + (a > b));

	
		System.out.println("a is greater than or equal to b :" + (a >= b));

		System.out.println("a is eqaul to b :" + (a == b));

		System.out.println("a is not eqaul to b :" + (a != b));


	}
}