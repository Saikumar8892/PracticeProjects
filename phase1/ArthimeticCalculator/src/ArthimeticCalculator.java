import java.util.Scanner;

public class ArthimeticCalculator {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner calculate = new Scanner(System.in);
		System.out.println("Enter num1:");
		double num1 = calculate.nextDouble();
		
		System.out.println("Enter num2:");
		double num2 = calculate.nextDouble();
		
		System.out.println("Enter operator(+,-,*,/,%)");
		char operator = calculate.next().charAt(0);
		
		double result = 0;
		switch(operator) {
		case '+':
			result = num1+num2;
			break;
		case '-':
			result = num1-num2;
			break;
		case '*':
			result = num1*num2;
			break;
		case '/':
			result = num1/num2;
			break;
		case '%':
			result = num1%num2;
			break;
		default:
			System.out.println("Sorry! operator is incorrect");
		}
		System.out.println(num1+" " + operator +" "+num2+ " = " + result);
	}
}

