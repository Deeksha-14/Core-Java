package fi;

public class LambdaExample {

	public static void main(String[] args) {
		MyFunction addition = (a, b)-> a+b;
		MyFunction multiplication = (a,b) -> a*b;
		MyFunction subtract = (a,b) -> a-b;
		MyFunction division = (a,b) -> a/b;
		
		
		int result = addition.performOperation(4, 2);
		System.out.println("Result of addition : "+result);
		
		int res = multiplication.performOperation(4, 4);
		System.out.println("Result of addition : "+res);
		
		int resu = subtract.performOperation(14, 4);
		System.out.println("Result of subtract : "+resu);
		
		int r = division.performOperation(12, 2);
		System.out.println("Result of subtract : "+r);
		

	}

}
