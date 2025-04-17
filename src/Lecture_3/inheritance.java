package Lecture_3;
//To inherit a class, you simply incorporate the definition of one class into another by using the extends keyword.
//class subclass-name extends superclass-name { // body of class
//}
//You can only specify one superclass for any subclass that you create. Java does not support the inheritance of
//multiple superclasses into a single subclass. You can, as stated, create a hierarchy of inheritance in which a subclass
//becomes a superclass of another subclass. However, no class can be a superclass of itself.
//
//Although a subclass includes all the members of its superclass, it cannot access those members of the superclass
//that have been declared as private.
//
//A Superclass Variable Can Reference a Subclass Object:
//It is important to understand that it is the type of the reference variable—not the type of the object that it refers
//to—that determines what members can be accessed.
//When a reference to a subclass object is assigned to a superclass reference variable, you will have access only to
//those parts of the object defined by the superclass.
// Parent class
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child class
class Student extends Person {
    String university;

    // Constructor
    Student(String name, int age, String university) {
        super(name, age);  // calling parent class constructor using super
        this.university = university;
    }
//Using super:
//Whenever a subclass needs to refer to its immediate superclass, it can do so by use of the keyword super.
//super has two general forms. The first calls the superclass’ constructor.
//The second is used to access a member of the superclass that has been hidden by a member of a subclass.
    // Overriding Method
    void displayInfo() {
        super.displayInfo(); // calling parent class method using super
        System.out.println("University: " + university);
    }
}

// Main class
public class inheritance {
    public static void main(String[] args) {
        Student student1 = new Student("Harsh Jain", 22, "Bennett University");
        student1.displayInfo();
    }
}

//Using final with Inheritance:
//
//The keyword final has three uses:
//
//# First, it can be used to create the equivalent of a named constant.
//
//# Using final to Prevent Overriding:
//To disallow a method from being overridden, specify final as a modifier at the start of its declaration.
//Methods declared as final cannot be overridden.
//Methods declared as final can sometimes provide a performance enhancement: The compiler is free to inline calls to them
//because it “knows” they will not be overridden by a subclass. When a small final method is called, often the Java
//compiler can copy the bytecode for the subroutine directly inline with the compiled code of the calling method, thus
//eliminating the costly overhead associated with a method call. Inlining is an option only with final methods.
//Normally, Java resolves calls to methods dynamically, at run time. This is called late binding. However, since final
//methods cannot be overridden, a call to one can be resolved at compile time. This is called early binding.
//
//# Using final to Prevent Inheritance:
//Sometimes you will want to prevent a class from being inherited. To do this, precede the class declaration with final.
//NOTE: Declaring a class as final implicitly declares all of its methods as final, too.
//As you might expect, it is illegal to declare a class as both abstract and final since an abstract class is incomplete
//by itself & relies upon its subclasses to provide complete implementations.
//
//# NOTE: Although static methods can be inherited ,there is no point in overriding them in child classes because the
//method in parent class will run always no matter from which object you call it. That is why static interface methods
//cannot be inherited because these method will run from the parent interface and no matter if we were allowed to
//override them, they will always run the method in parent interface.
//That is why static interface method must have a body.
//
//NOTE : Polymorphism does not apply to instance variables.

