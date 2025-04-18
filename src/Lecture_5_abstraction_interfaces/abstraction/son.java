package Lecture_5_abstraction_interfaces.abstraction;

//public abstract class son extends Parent{
//
//}
//there are 2 ways to inherit an abstract class:
//1. make child class abstract
//2. implement the abstract methods in child class
class son extends Parent{

    public son(int age) {
        super(age);
    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void job(String name) {
        System.out.println("I am a "+name);
    }

    @Override
    void passion(String name) {
        System.out.println("But becoming a "+name+" is my passion");
    }
}
