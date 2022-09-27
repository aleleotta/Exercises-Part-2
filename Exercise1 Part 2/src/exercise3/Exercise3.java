package exercise3;
import java.util.*;

public class Exercise3 {
	public static void main(String[] args ) {
		Scanner keyboard = new Scanner(System.in); //Declaración de scanner
		int num1, num2; //Declaración de variables
		num2 = 6; //Asignación de valor
		System.out.print("Enter value: "); //Imprimido de pregunta
		num1 = keyboard.nextInt(); //Usuario escribe 10
		num1 = num1 + 2; //num1 = 10 + 2
		num2 = num1 / num2; //num2 = 12 / 6 = 2
		System.out.println("result = " + num2); //Imprimido de resultado
		keyboard.close(); //Cierre de scanner
		}
}
