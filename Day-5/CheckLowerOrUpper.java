import java.util.Scanner;

public class CheckLowerOrUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);

        String str = (ch >= 97 && ch <= 122)?"lower case": "upper case";

		System.out.println("the char is in:  " + str );
    }
}
