package testlambdas;

public class LambdasSwitchCase {
	
	static double calculate(String operator, double x, double y) {
	return switch (operator) {
	case"+" -> x+y;
	case"-" -> x-y;
	case"*" -> x*y;
	case"/" -> {
		if(y==0) {
			throw new IllegalArgumentException("can't devide by 0");
		}
		yield x/y;
	}
	default -> throw new IllegalArgumentException("Unexpected value: " + operator);
	};
	}

public static void main(String[] args) {
	LambdasSwitchCase op = new LambdasSwitchCase();
	System.out.println(op.calculate("+", 7, 4));
	System.out.println(op.calculate("-", 4, 7));
	System.out.println(op.calculate("*", 7, 4));
	System.out.println(op.calculate("/", 4, 2));
	
	
}}
