import java.util.Scanner;
class LeapYear{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		String str= (year%400==0 || (year%4 == 0 && year%100!=0))?"yes":"no";
		System.out.println(str);
	}
}