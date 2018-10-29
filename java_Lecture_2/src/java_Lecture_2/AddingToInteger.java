package java_Lecture_2;

class AddingToInteger {

	public void addtion() {
		int num1 = 10;
		int num2 = 20;
		int result = num1 - num2;
		System.out.println("The sum is: " + result);
	}

	void subtion(int num1, int num2) {
		int result = num1 - num2;
		System.out.println("The difference is: " + result);
	}

	public void multiplication(int num1, int num2) {
		int result = num1 * num2;
		System.out.println("The product is: " + result);
	}

	public void division(int num1, int num2) {
		int result = num1 / num2;
		System.out.println("The quotient is: " + result);
	}

	public void module(int num1, int num2) {
		int result = num1 % num2;
		System.out.println("The reamining is: " + result);
		addtion();
	}

	
	
	
	public static void main(String[] args) {

		AddingToInteger add = new AddingToInteger();
		
		add.addtion();
		add.subtion(4, 9);
		add.multiplication(4, 5);
		add.division(4, 8);
		add.module(7, 5);
	}

}