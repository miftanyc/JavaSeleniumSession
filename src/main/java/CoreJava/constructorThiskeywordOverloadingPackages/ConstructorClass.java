package CoreJava.constructorThiskeywordOverloadingPackages;

public class ConstructorClass {

    // For this Tutorial "ConstructorClass" will Create Constructor and "ConstructorClassDemo" Will Demonstrate This.

    // Declaration of data
    String Make;
    String Model;
    String Color;
    int Year;
    int Milage;
    int Price;


    public ConstructorClass(String make, String model, String color, int year, int milage, int price) {
        Make = make;
        Model = model;
        Color = color;
        Year = year;
        Milage = milage;
        Price = price;

    }

    public void startCar() {
        System.out.println(Make + " " + Model + " " + Year + " Started");
    }

    public void stopCar() {
        System.out.println(Make + " " + Model + " " + Year + " Stopped");
    }

    public void carDescription() {
        System.out.print("This is " + Make + " " + Model + " " + Year + ". ");
        System.out.print("Its " + Color + " Color" + ". ");
        System.out.println("Right now the Milage is " + Milage + " And the price is " + Price);
    }


}

	/*Constructors are similar to methods, but have the below differences:
	
		# Demonstrate the constructors having the below qualities here
			*Constructors have the same name as Class name
			*Constructors are automatically called when an object is created for the Class
			*Constructors won't have any return type - Return types like void, int etc won't be available for constructors
			*Empty hidden Constructor will be called, when an object is created for the Class not specified with explicit constructors
		# Constructors simplify the initialization of variables 
	*/