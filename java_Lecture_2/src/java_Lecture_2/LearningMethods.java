package java_Lecture_2;

public class LearningMethods {
	
	int j; // declation , intialize
	// display
	//Return type --> dataType of the value returned by method
	
	//display
	public void show() {
		int a;
		int b;
		String c;
	}
	public int display ( int k, String a, char c, float f, boolean b) // declare --> define
	{//starts
		/*
		 * 
		 * all definition goes here !!!
		 * 
		 * 
		 */
		int j = 120; //defining 
		System.out.println("Inside Display Method");
		//String x = "Hello;
		//return "hello"; // last statement
		return  10;
		
	}//ends
	public static void main(String[] args) {
		
		/*LearningMethods l = new LearningMethods();
		l.display(k, a, c, f, b);
		l.show();
		System.out.println("hi how are you");*/
		
		LearningMethods learn = new LearningMethods();
		learn.show();
		
		//learn.display(k, a, c, f, b);
		LearningMethods learn1 = new LearningMethods();
		learn1.show();

	}

}
