//Importing Class: "ConstructorClass" From Same Package: "constructorThiskeywordOverloadingPackages"


package CoreJava.constructorThiskeywordOverloadingPackages;

public class ImportingClassFromSamePackage {

    public static void main(String[] args) {

        // 1st Create a object
        ConstructorClass BMW = new ConstructorClass("Toyota", "Rav4", "Pearl White", 2023, 2300, 43000);

        // Call The Method From "ConstructorClass" Using Object "BMW"
        BMW.startCar();
        BMW.stopCar();
        BMW.carDescription();
    }
}
