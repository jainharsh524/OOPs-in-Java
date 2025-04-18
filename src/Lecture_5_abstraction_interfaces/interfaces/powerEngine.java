package Lecture_5_abstraction_interfaces.interfaces;

public class powerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("powerEngine started");
    }

    @Override
    public void stop() {
        System.out.println("powerEngine Stopped");
    }

    @Override
    public void acc() {
        System.out.println("powerEngine accelerated");
    }
}
