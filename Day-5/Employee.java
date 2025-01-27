import java.util.Scanner;
class Employee{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		byte exp = sc.nextByte();
		int salary = sc.nextInt();

		int bonus = (exp > 20 ) ? ((salary *20)/100) : ((salary * 10)/100);

		System.out.println("bonus is " + bonus);

		int total = salary + bonus;
		
		System.out.println("now total salary is " + total);
	}
}