package CoreJava.interfacePackageB;

public class BBankClass implements BBankInterface {

    @Override
    public void viewAccountBalance() {
        System.out.println("View bank balance");

    }

    @Override
    public void transferFund() {
        System.out.println("Fund Transfer");

    }

    @Override
    public void openFixedDeposit() {
        System.out.println("Open Fixed Deposit");

    }

}
