public class Lecture_1 {
    public static void main(String[] args) {
        Student Harsh = new Student(15, "Harsh Jain", 94.83f, "Naresh Chand Jain", "Rajrani Jain");
        Student defaultStudent = new Student();
        Harsh.displayDetails();
        defaultStudent.displayDetails();//shows the details which are in the empty parameterised constructor.
    }
}
class Student{
    int rno;
    String name;
    float marks;
    String fName;
    String mName;
    //The 'this' keyword in Java is used to refer to the current object of the class within an instance method or constructor.
    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }
    // Student arpit = new Student(17, "Arpit", 89.7f);
    // here, this will be replaced with arpit
    //A constructor is a special method in a class that is automatically called
    // when an object of that class is created.
    // It is used to initialize objects with default or specific values when they are instantiated.
    Student () {
        // this is how you call a constructor from another constructor
        // internally: new Student (13, "default person", 100.0f);
        this (13, "default person", 100.0f, "default fName", "default mName");
    }
    Student (int rno, String name, float marks, String fName, String mName) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
        this.mName = mName;
        this.fName = fName;
    }
    Student  (Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
    void displayDetails(){
        System.out.println("Roll No.- "+this.rno);
        System.out.println("Name- "+this.name);
        System.out.println("Marks- "+this.marks);
        System.out.println("Father's Name- "+this.fName);
        System.out.println("Mother's Name- "+this.mName);
    }
}
