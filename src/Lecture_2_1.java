import java.util.Arrays;

public class Lecture_2_1 {

    static class Test {
        String name;
        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
//outermost classes cannot be static.
    //here static class test can point to 2 different object
    // but if we make objects of lecture_2_1 class then it will be pointing to the same objects
    //as it is an attribute to that class.

//In Java:

    //The static keyword means that something belongs to the class itself, rather than to instances (objects) of the class.
    //static is mainly used with nested classes, methods, and variables.

// Now — for outermost (top-level) classes:

    //Top-level classes are not members of any other class.
    //Since static is a modifier that applies to members of a class (like inner classes or methods),
    // it does not make sense to apply it to a top-level class.

    //In simpler terms: 👉 A static class needs a surrounding class to belong to — and a top-level class has none.

    public static void main(String[] args) {
        Test a = new Test("Harsh");
        Test b = new Test("Rahul");

        System.out.println(a);

//        System.out.println(a.name);
//        System.out.println(b.name);
    }
}
