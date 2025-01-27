import java.util.Scanner;

public class CheckPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int marks = sc.nextInt();


        String s = (marks > 50) ? "Pass" : "Fail";
        System.out.println("The Student is :" + s);
    }
}
