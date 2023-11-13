package JavaCodingChallange;

public class Swapping2Number {

	public static void main(String[] args) {
		int a = 10, b =20;
		Swapping2Number obj = new Swapping2Number();
		System.out.println("Value before Swapping-> a: "+ a + ",    b: " + b);
		obj.usingTempVariable();
		obj.usingPlusMinus();
		obj.usingMultiplicationDivision();
		obj.usingXorCarrotOperator();
		obj.singleStatementArgument();

	}
	
	//Logic 1: Using Temporary Variable
	public void usingTempVariable() {
		int a = 10, b =20;
		int t = a;
			a=b; 
			b=t;
			
		System.out.println("usingTempVariable: Value after Swapping-> a: "+ a + ",    b: " + b);
	}
	
	//Logic 2: Using Plus Minus Without using Temporary variable
	public void usingPlusMinus() {
		int a = 10, b =20;
		a = a+b;	//a= 10+20 = 30
		b = a-b;	//b= 30-20 = 10
		a = a-b;	//a= 30-10 = 20
		System.out.println("usingPlusMinus: Value after Swapping-> a: "+ a + ",    b: " + b);	
	}
	
	//Logic 3: Using Multiplication and Division Without Using Temporary Variable
	public void usingMultiplicationDivision() {
		int a = 10, b =20;
		a = a*b;	// a = 10X20 = 200
		b = a/b;	// b = 200/20 = 10
		a = a/b;	// a = 200/10 = 20
		System.out.println("usingMultiplicationDivision: Value after Swapping-> a: "+ a + ",    b: " + b);
	}
	
	// Logic 4: Using Bitwise XOR (^) operator 
	public void usingXorCarrotOperator() {
		int a = 10, b =20;
		a = a^b;	//a = 10^20 = 30
		b = a^b;	//b = 30^20 = 10
		a = a^b;	//a = 30^10 = 20
		System.out.println("usingXorCarrotOperator: Value after Swapping-> a: "+ a + ",    b: " + b);
	}
	
	//Logic 5: Using sigle statement
	public void singleStatementArgument() {
		int a = 10, b =20;
		b = a+b - (a=b); 
		//b = a+b - (a=b)= 10+20 - (20); b = 10. as a=b withing perenthesis so a = 20.	
		System.out.println("singleStatementArgument: Value after Swapping-> a: "+ a + ",    b: " + b);
	}
}
