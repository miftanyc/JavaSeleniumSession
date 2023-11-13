package CoreJava.interfacePackage;

public abstract class ATDBankClass implements ABankInterface { // to make child class of a interface you need to use "implement" keyword.

    // Interface has Three Method So you need to implement all Three method in Child Class.

    // If you wanna bypass all tree instead you want selected method to implemented you Can change this class to "Abstract"


    @Override
    public void viewAccountBalance() {
        System.out.println("View Account Balance");

    }

    @Override
    public void transferFund() {
        System.out.println("Transfering Fund");

    }

    // After Making this class abstract i am able to remove one method of parent interface from child class to implement.

    // If you wanna implemnt the Remaining method you didnt implement here you still can create a child class of this class and implement There ---> Check for : "TDBankClassChild" Class


}
