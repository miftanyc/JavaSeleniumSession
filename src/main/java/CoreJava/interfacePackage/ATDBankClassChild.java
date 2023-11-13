package CoreJava.interfacePackage;

public class ATDBankClassChild extends ATDBankClass {

    // Here we will execute the method

    public static void main(String[] args) {
        // Create a object first
        ATDBankClassChild tdbank = new ATDBankClassChild();

        tdbank.viewAccountBalance();
        tdbank.transferFund();
        tdbank.openFixedDeposit();

        System.out.println("Account type :  " + ABankInterface.ACCOUNTTYPEONE);
        System.out.println("Account type : " + ABankInterface.ACCOUNTTYPETWO);
        // As those Variable are interface memory. to use this you cannot create object. you have to use interfacname.variable

    }

    @Override
    public void openFixedDeposit() {
        // This method was not implemented in "TDBankClass" so we are implementing here as Multilabel Inheritance

        System.out.println("Opening Fixed Deposit");
    }

}

/********************
 You can not create object for
 a. Inteface
 b. Abtract Class

 How to bypass that issue?
 <> Create a child class and create object there.
 **********************/