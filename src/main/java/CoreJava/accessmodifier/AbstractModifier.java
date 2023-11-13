package CoreJava.accessmodifier;

public abstract class AbstractModifier { // When Clas has Abstract Method Class Has to be abstact

    public abstract void abstractMethod(); // Abstract Method has No Method Body

    public void regularMethod() { // Abstract Class can contain regular Method
        System.out.println("This is  Regular Method Body");

    }
}
