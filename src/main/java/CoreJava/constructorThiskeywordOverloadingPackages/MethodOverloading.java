package CoreJava.constructorThiskeywordOverloadingPackages;

public class MethodOverloading {

    // all those method has same name "methodA". Only the Parameter change allow the method overloading.
    public void methodA() {

    }

    public void methodA(int a) {

    }

    public void methodA(double b) {

    }

    public void methodA(int a, char c) {

    }

    public void methodA(char c, int a) {

    }

}

	/*method overloading
		[] Two or more methods having the same name can be created inside a single class When these method differ in term of: 
	 				-	Number of Parameter
	 				- 	Different type of Parameter
	 				-	Order of Parameter
		{} In this case, the methods are said to be overloaded and the concept is knows as Method overloading
	
	*/