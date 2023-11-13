package CoreJava.accessmodifier;

public class ChildOfAbstractModifier extends AbstractModifier { // Click unimplemented Methods

    public static void ChildMethod1() {
        System.out.println("Static Method Call by ClassName.MethodName");
    }

    // Create additional method that only belong to Class: ChildOfAbstractModifier

    @Override
    public void abstractMethod() {
        // Now you can write Method Body withing the abstractMethod
        System.out.println("This is Abstract Method Body");

    }

    public void ChildMethod() {
        System.out.println("This is Child Method Body");
    }

}
