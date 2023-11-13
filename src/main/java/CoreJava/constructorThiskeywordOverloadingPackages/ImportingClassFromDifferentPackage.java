//Importing Class: "ClassessAndObjects" From Different Package: "classesObjectsStringsWrapperclasses"


package CoreJava.constructorThiskeywordOverloadingPackages;


import CoreJava.classesObjectsStringsWrapperclasses.ClassessAndObjects;


public class ImportingClassFromDifferentPackage {

    public static void main(String[] args) {

        //Create the Object
        ClassessAndObjects BMW = new ClassessAndObjects(); // There will be a error. Because you didnt import the class into this package. so import it to resolve the issue.


        //Execute statement
        BMW.Brand = "BMW S Series";
        System.out.println("Car Brand " + BMW.Brand);
        // This will not recognize the Brand as you didnt define it public in "ClassAndObject"

        //you can access Data within same Package without defining public
        //to access data amaong different package you must need to define data public so can other package can access data


    }

}
