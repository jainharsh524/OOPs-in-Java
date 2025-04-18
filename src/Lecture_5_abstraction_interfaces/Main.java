package Lecture_5_abstraction_interfaces;

public class Main {
    public static void main(String[] args) {
        son s = new son(21);
        s.job("Coder");
        s.passion("Martial Artist");
        s.normal();
        daughter d  = new daughter(19);
        d.job("DJ");
        d.passion("Dance");

//        Parent dad = new Parent();
        Parent.hello();
        //Notes:
        //1.you can't create objects of an abstract class. because if you create object and call an abstract method then that method has nothing. for similar reason you can't create abstract constructor
        //2.abstract static methods can't be created because abstract methods needs to be overridden but static method can;t be overridden.
        //3.To run concrete static methods on an abstract class just use the class name. but for normal methods you have to inherit them and override them in child classes after that you can call those methods using child class object.
        //4.You can't have final abstract classes because after final keyword you can't override methods.
    }
}
