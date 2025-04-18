package Lecture_5_abstraction_interfaces.interfaces;

public class Main {
    public static void main(String[] args) {
//        car c = new car();

//        Engine c = new car();
        //can't access' what is inside the car only. and not in engine
//        c.start();
//        c.acc();
//        c.brake();
//        c.stop();
//        Media carMedia = new car();
//        carMedia.stop();
        niceCar car = new niceCar();
        car.start();
        car.stop();
        car.startMusic();

        electricEngine eE = new electricEngine();
        niceCar car1 = new niceCar(eE);
        car1.start();
        car1.stop();
        car1.startMusic();
    }
}
