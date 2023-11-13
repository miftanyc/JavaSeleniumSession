package CoreJava.accessmodifier;

public class DemoOfAbstractMethod {

    public static void main(String[] args) {
        // Can NOT Create object of Class: AbstractModifier. As this is a abstract Class

        // But Can create Object of Child Class: ChildOfAbstractModifier. As this child class through which we can access data from Parent Class: AbstractModifier.

        ChildOfAbstractModifier obja = new ChildOfAbstractModifier();

        // Call the Absract Method
        obja.abstractMethod();
        System.out.println("-------------------------");

        // Call the Regular Method Through Class: ChildOfAbstractModifier
        obja.regularMethod();
        System.out.println("-------------------------");

        // Call The CHild Method from Class: ChildOfAbstractModifier
        obja.ChildMethod();
        System.out.println("-------------------------");

        // The below one is Static Method so Use Class name to Call this
        ChildOfAbstractModifier.ChildMethod1();

    }
}
