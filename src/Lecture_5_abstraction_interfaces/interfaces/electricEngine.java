package Lecture_5_abstraction_interfaces.interfaces;

public class electricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("electricEngine Started");
    }

    @Override
    public void stop() {
        System.out.println("electricEngine Stopped");
    }

    @Override
    public void acc() {
        System.out.println("electricEngine accelerated");
    }
}
