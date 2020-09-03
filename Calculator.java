import java.util.*;
import java.math.*;

public class Calculator {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		double sum = calc.add(2,2);
		double square_root = calc.findSqRoot(3600);
		double exp = calc.raisedToExp(5, 3);
		System.out.println(sum);
		System.out.println(square_root);
		System.out.println(exp);
		
	}

public double add(double a, double b) {
	return a + b;
}

public double subtract(double a, double b) {
	return a - b;
}

public double multiply(double a, double b) {
	return a * b;
}

public double divide (double a, double b) {
	return a / b;
}

public double findSqRoot(double a) {
	return Math.sqrt(a);
}

public double raisedToExp(int a, int b) {
	return Math.pow(a, b);
}
}
//be able to add, subtract, multiply and divide numbers
//be able to raise one number to the exponent of another
//be able to find the sq. root of a number
//print the results in a new window

//
