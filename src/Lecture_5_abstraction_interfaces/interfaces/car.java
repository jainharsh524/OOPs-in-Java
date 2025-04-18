package Lecture_5_abstraction_interfaces.interfaces;

public class car implements Engine, Brake, Media{
    //here in engine and media there are same functions named start and stop.
    //let's say first we have defined the start and stop for engine.
    //now we can't define for media.
    //that's why we create separate classes for the interfaces a well.
    @Override
    public void brake() {
        System.out.println("I am brake");
    }

    @Override
    public void start() {
        System.out.println("I have started the engine");
    }

    @Override
    public void stop() {
        System.out.println("I have stopped the engine");
    }

    @Override
    public void acc() {
        System.out.println("Accelerated");
    }
}
