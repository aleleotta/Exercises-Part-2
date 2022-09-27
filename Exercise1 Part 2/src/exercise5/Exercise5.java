package exercise5;
import java.util.*;

public class Exercise5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x, y;
		double perimeter, area;
		System.out.print("Horizontal x: ");
		x = sc.nextDouble();
		System.out.print("Horizontal y: ");
		y = sc.nextDouble();
		perimeter = x + y;
		area = x * y;
		System.out.println("Perimeter: " + perimeter + "     Area: " + area);
		sc.close();
	}
}
