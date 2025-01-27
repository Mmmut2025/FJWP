import java.util.Scanner;

public class CheckAlphabateAndLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any char");
		char ch = sc.next().charAt(0);

        //An alphabate is a lower or upper letter
        boolean isAlphabate = false;
       

        String str = ((ch >=97 && ch <=122 ) || (ch >= 65 && ch <= 90)) ? ((ch >=97 && ch <=122)? ("Lower case"):("Upper case")) : ("Not Alphabate");

		System.out.println("the char is in:  " + str );
    }
}
