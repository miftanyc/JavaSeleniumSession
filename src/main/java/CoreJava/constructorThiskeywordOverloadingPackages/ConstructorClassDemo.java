package CoreJava.constructorThiskeywordOverloadingPackages;

public class ConstructorClassDemo {

    public static void main(String[] args) {

        //Initialization Process [Constructor simplifies it]
        ConstructorClass BMW = new ConstructorClass("BMW", "S Series", "Royal Blue", 2020, 32000, 45000);

        ConstructorClass Toyota = new ConstructorClass("Toyota", "Corolla", "Silver", 2023, 6100, 27000);

        ConstructorClass Honda = new ConstructorClass("Honda", "Civic", "Black", 2021, 9400, 29000);

        ConstructorClass Marcedez = new ConstructorClass("Marcedez", "Executive Series", "Pearl White", 2023, 29000, 76000);


        // Call Method for BMW
        BMW.startCar();
        BMW.stopCar();
        BMW.carDescription();
        System.out.println();


        // Call Method for Toyota
        Toyota.startCar();
        Toyota.stopCar();
        Toyota.carDescription();
        System.out.println();


        // Call Method for Honda
        Honda.startCar();
        Honda.stopCar();
        Honda.carDescription();
        System.out.println();


        // Call Method for Marcedez
        Marcedez.startCar();
        Marcedez.stopCar();
        Marcedez.carDescription();
    }

}
