//Learning Classes

package CoreJava.classesObjectsStringsWrapperclasses;

public class ClassessAndObjects {

    public String Brand; //Defining public can allow access this data in different package.
    String Model;
    String Color;
    int Mpg;
    int Price;

    public static void main(String[] args) {
        ClassessAndObjects Audi = new ClassessAndObjects();
        ClassessAndObjects BMW = new ClassessAndObjects(); // Object Creation Statement

        Audi.Brand = "Audi";
        Audi.Model = "A8";
        Audi.Color = "Royal Blue";
        Audi.Mpg = 26;
        Audi.Price = 29000;

        BMW.Brand = "BMW";
        BMW.Model = "Class S";
        BMW.Color = "Pearl White";
        BMW.Mpg = 22;
        BMW.Price = 42000;

        Audi.startCar();
        System.out.println();
        BMW.startCar();
        System.out.println();

        Audi.stopCar();
        System.out.println();
        BMW.stopCar();
        System.out.println();

        Audi.carDetail();
        System.out.println();
        BMW.carDetail();

    }

    public void startCar() {
        System.out.println(Brand + " " + Model + " Started");
    }

    public void stopCar() {
        System.out.println(Brand + " " + Model + " Turned Off");
    }

    public void carDetail() {
        System.out.println("This is " + Brand + " " + Model + " in " + Color + " with amazing Mpg of " + Mpg + ", And Priced " + Price);

    }

}

/* LearningClasses Audi = new LearningClasses();
 * 		LearningClasses 	-> Class
 * 		Audi 				-> Reference Variable
 * 		new					-> Operator used for object creation
 * 		LearningClasses() 	-> Constructor
 */
