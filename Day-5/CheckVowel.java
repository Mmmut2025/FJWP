import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		char chh = sc.next().charAt(0);

        // Convert to lowercase
        char ch = Character.toLowerCase(chh);

        String str = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )?"vowel": "Not vowel";

		System.out.println("the char is in:  " + str );
    }
}
