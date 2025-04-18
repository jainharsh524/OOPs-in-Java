package Lecture_5_abstraction_interfaces.abstraction;

public class daughter extends Parent{
    public daughter(int age) {
        super(age);
    }

    @Override
    void job(String name) {
        System.out.println("I am a "+name);
    }

    @Override
    void passion(String name) {
        System.out.println("but I have my passion towards "+name);
    }
}
