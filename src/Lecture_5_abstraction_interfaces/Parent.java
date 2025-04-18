package Lecture_5_abstraction_interfaces;

public abstract class Parent {
    int age;

    public Parent(int age) {
        this.age = age;
    }
    static void hello(){
        System.out.println("How you doin\' boy???");
    }
    void normal(){
        System.out.println("I am just a non-static method.");
    }

    //📖 What is an Abstract Class in Java?
    //An abstract class in Java is a class that cannot be instantiated on its own — it’s meant to be inherited by other classes. It can contain:
    //Abstract methods (methods without a body)
    //Concrete methods (regular methods with a body)
    //Fields (variables)
    //Constructors
    //Abstract classes act as partially implemented blueprints for subclasses.
    abstract void job(String name);
    abstract void passion(String name);


    //Notes:
    //1.if there is an abstract function in a class then class should also be an abstract class.
    //2.An abstract class can only be inherited by an abstract class.
    //3.If you definitely know that functions in the parent class need to be overridden. Then make them abstract methods.
}
