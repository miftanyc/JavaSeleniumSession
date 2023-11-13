package CoreJava.interfacePackageB;

public class BBankDemoClass extends BBankClass {

    // Create an object of BBankClass that is Assigned to BBankInterface's Method And Variable
    public static void main(String[] args) {
        BBankInterface boa = new BBankClass();
        boa.transferFund();
        boa.viewAccountBalance();
        boa.openFixedDeposit();
        System.out.println(BBankInterface.ACCOUNTTYPEONE);
        System.out.println(BBankInterface.ACCOUNTTYPETWO);
    }
}
