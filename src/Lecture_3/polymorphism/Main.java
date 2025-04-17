package Lecture_3.polymorphism;

public class Main {
    //Polymorphism is the ability of an object to take on many forms.
    // In Java (and most OOP languages), it allows methods to behave differently based on the object
    // that is calling them, even if they share the same name.


    //In method overloading if order of parameters is different
    //both of them can exist without any error.Ex.-
    static String append(String a, int b){
        String c = a+b;
        return c;
    }
    static String append(int a, String b){
        String c = a+b;
        return c;
    }
    public static void main(String[] args) {
        shapes obj = new shapes();
        obj.area();
        circle cir = new circle();
        square sq = new square();
        cir.area();
        sq.area();
        String x = append(5,"Harsh");//Here it decides at compile time only which function we have to run.
        System.out.println(x);
        String y = append("Harsh", 5);//that's why it is called static polymorphism.
        System.out.println(y);

//Overriding:-
        shapes newCircle = new circle();
        newCircle.area();
//🔍 What Happens Here (Overriding Explained)
//Shapes newCircle = new Circle();
//newCircle is declared as type Shapes but refers to a Circle object.
//newCircle.area();
//Even though the reference type is Shapes, Java checks the actual object type at runtime, which is Circle.
//Since Circle overrides the area() method from Shapes, Java calls the overridden area() method in the Circle class.
    }
}
//✅ Types of Polymorphism:
//Compile-time/Static Polymorphism (Method Overloading):-
//Multiple methods with the same name but different parameters within the same class.

//Run-time Polymorphism (Method Overriding):-
//A subclass provides a specific implementation of a method already defined in its parent class.



//🛠️ How Method Overriding Works
//When a subclass defines a method with the same name, return type, and parameters as a method in its parent class,
//the version in the subclass overrides the one in the parent class.
//At runtime, the actual type of the object (not the reference type) determines which method gets called.
//This is what enables runtime polymorphism.

//✅ How Java handles it:
//When a method is called on an object:
//Java looks at the actual object’s class (not the reference type).
//If the method is overridden in the subclass, it executes the subclass version.
//If not, it falls back to the parent class version.

//✅ Why This Works:
//Overriding happens when the child class (Circle) has a method with the same signature as in the parent class (Shapes).
//At runtime, Java decides which method to execute based on the actual object’s type — not the reference type.
//This is runtime polymorphism in action.