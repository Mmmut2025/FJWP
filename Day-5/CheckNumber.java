import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int num = sc.nextInt();


        String s = (num > 0) ? "Positive" : "Negative";
        System.out.println("the number is :" + s);
    }
}
