package Lecture_5_abstraction_interfaces.interfaces;

public class cdPlayer implements Media{

    @Override
    public void start() {
        System.out.println("Media Starts");
    }

    @Override
    public void stop() {
        System.out.println("Media Stops");
    }
}
