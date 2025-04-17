package Lecture_3.polymorphism;

public class circle extends shapes{
    @Override
    void area() {
        System.out.println("Area of a circle = pi*r^2");
    }
    //📖 Method Overriding in Java (OOP)
    //Method Overriding is a feature in object-oriented programming where a subclass provides its own specific implementation of a method that is already defined in its parent class.
    //
    //When a method in a subclass has the same name, return type, and parameters as a method in its superclass, the subclass version overrides the superclass version.
    //
    //✅ Key Points:
    //Happens at runtime (Run-time Polymorphism).
    //
    //The method in the child class should have the same signature as in the parent class.
    //
    //Uses the @Override annotation for clarity (optional but recommended).
    //
    //The subclass version is executed when called from an object of the subclass.
}
