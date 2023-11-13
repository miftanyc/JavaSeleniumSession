// Learning Interface

//Lets create interfacr for banking Domain
package CoreJava.interfacePackage;

public interface ABankInterface {

    String ACCOUNTTYPEONE = "Saving";
    String ACCOUNTTYPETWO = "Checking"; // You need to initiazie as soon as you declare the variable. Because bydefault interface variable are STATIC and FINAL.

    // Whenever you declaire a variable that are final and will not change in alter its nomenclature to type variable name in all caps.


    public void viewAccountBalance(); // By default its Abstract*** Method so NO*** Method Body


    public void transferFund();


    public void openFixedDeposit();

}


// In Interface By Dfault
// Variable are Final And Static
// Method are Abstract