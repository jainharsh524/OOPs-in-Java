package Lecture_4_access.packageTwo;

import Lecture_4_access.packageOne.Base;

public class Derived extends Base {
    public static void show(){
        Base obj = new Base();
//        obj.display();       // this is not working
//        kyuki na to ye class same package me banai gyi h na hi ye class subclass h
        new Derived().display();    // is working
//        display();//is working
    }

    public static void main(String[] args) {
        show();
    }
//protected allows access from subclasses and from other classes in the same package.
//We can use child class to use protected member outside the package but only child class object can access it.
//That's why any Derived class instance can access the protected method in Base.
//The other line creates a Base instance (not a Derived instance!!).
//And access to protected methods of that instance is only allowed from objects of the same package.
//
//display();
//-> allowed, because the caller, an instance of Derived has access to protected members and fields of its subclasses,
//even if they're in different packages
//
//
//new Derived().display();
//-> allowed, because you call the method on an instance of Derived and that instance has access to the protected methods
//of its subclasses
//
//new Base().display();
//-> not allowed because the caller's (the this instance) class is not defined in the same package like the Base class,
//so this can't access the protected method. And it doesn't matter - as we see - that the current subclasses a class from
//that package. That backdoor is closed ;)
//
//Remember that any time talks about a subclass having access to a superclass member, we could be talking about the
//subclass inheriting the member, not simple accessing the member through a reference to an instance of the superclass.
}

