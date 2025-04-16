public class Lecture_2 {
    public static void main(String[] args) {
        Human harsh = new Human(21, "Harsh", "Male", false);
        Human ullas = new Human(21, "Ullas", "Male", false);
//        System.out.println(harsh.population);
//        System.out.println(ullas.population);
//        System.out.println(Human.population);
        //inside a static method you cannot use anything that is not static.
        staticBlock block = new staticBlock();
        System.out.println(block.a+ ", "+block.b);
        block.b+=3;
        System.out.println(block.a+ ", "+block.b);
    }
    static void fun(){
        // A static method can access static data only, it cannot access non-static data.
        //greetings(); we can't use this function because it requires an instance of a class
        //while fun doesn't require any instance so that's why we can't use a non-static function inside a static function.
        Lecture_2 obj = new Lecture_2();
        obj.greetings();
        // to use non-static method inside a static method we need to create an object.
    }
    void fun2(){
        greetings();
        //under a non-static method we can use non-static method directly
        // because in the end an object for this will be created.
        //because whenever you call fun2 in the end we call it somewhere in the main function.
        // and to call it we have to create an object.
        //this greetings function will also be bound to that object.
    }
    void greetings(){
        System.out.println("Hi there");
    }
}
//something which is not static belongs to an object.
class Human{
    int age;
    String name;
    String sex;
    boolean married;
    static long population;
    //in this class attribute population means total no. of objects of this Human class
    //but instead of this when we do not make population attribute 'static' it does not give the correct value.
    //it will always give the value 1.
    //use of static relate that attribute to all the objects.
    //hence, we need class name. we do not need object name to access that attribute.
    public Human(int age, String name,String sex, boolean married){
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.married = married;
        Human.population+=1;
    }
    static void message(){
        System.out.println("Hi there");
//        System.out.println("How you doin\'"+this.name);
        //can't use this inside a static method as this keyword is used for current object of a class.
    }
}
class staticBlock{
    static int a = 4;
    static int b;
    //this static block will run only once when 1st object is created
    // means when class is loaded for the first time.
    static {
        System.out.println("I am in the static block");
        b = a*4;
    }
}
