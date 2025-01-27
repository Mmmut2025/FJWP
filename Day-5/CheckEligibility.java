import java.util.Scanner;

public class CheckEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the of voter");
        Byte age = sc.nextByte();

        String str = (age >= 18) ? "Eligible for vote" : "Not eligible for vote";
        System.out.println(str);

        sc.close();
    }
}
