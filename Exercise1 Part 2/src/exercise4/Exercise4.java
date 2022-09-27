package exercise4;
import java.util.*;

public class Exercise4 {
	public static void main(String[] args) {
		// declare variables
		Scanner keyboard = new Scanner(System.in);
		int x, y, z;
		// enter values
		System.out.print("Enter value for x: ");
		x = keyboard.nextInt();
		System.out.print("Enter value for y: ");
		y = keyboard.nextInt();
		// code attempting to swap two variables
		z = x;
		x = y;
		y = z;
		//display results
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		keyboard.close();
	}
}

/*
Can you see why the program doesn’t do what we hoped?
The variables only equal to a single number instead of swapping.
What would be the actual output of the program?
Single number prints out.
How could you modify the program above so that the values of the two variables are swapped successfully?
A third variable can be included in the code to compensate the value swap.
*/