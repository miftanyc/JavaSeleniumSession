package CoreJava.constructorThiskeywordOverloadingPackages;

public class ThisKeyword {

    String Make;
    String Model;
    String Color;
    int Price;

    public ThisKeyword(String Make, String Model, String Color, int Price) {
        this.Make = Make;
        this.Model = Model;
        this.Color = Color;
        this.Price = Price;
        // "this" keyword help to define instance variable. for example Make is present both in instance variable and also in the parameter. so "this" keyword identify the instance variable not the parameter
    }


    public static void main(String[] args) {
        ThisKeyword BMW = new ThisKeyword("BMW", "S Series", "Black", 45000);
        ThisKeyword Honda = new ThisKeyword("Honda", "Accord", "Blue", 35000);
        ThisKeyword Toyota = new ThisKeyword("Toyota", "Camry", "White", 31000);

        BMW.carDescription();
        System.out.println("----------------------------");

        Honda.carDescription();
        System.out.println("----------------------------");

        Toyota.carDescription();


    }

    public void carDescription() {
        System.out.println("This is " + Make + " " + Model + " .");
        System.out.println("Color is " + Color + ". " + "Price is " + Price + ".");
    }
}
