import java.util.*;
class AreaOfCircle {
    public static void main(String args[]) {
        final float pi = 3.14f;

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the radius of circle");
	float radius = sc.nextFloat();

        double area = pi * radius * radius;

        System.out.println("The area of the circle is: " + area);
    }
}