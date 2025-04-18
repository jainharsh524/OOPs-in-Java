package Lecture_5_abstraction_interfaces.interfaces;

public class niceCar {
    Engine engine;
    Media mediaPlayer = new cdPlayer();

    public niceCar() {
        engine = new powerEngine();
    }

    public niceCar(Engine engine) {
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startMusic(){
        mediaPlayer.start();
    }
    public void stopMusic(){
        mediaPlayer.stop();
    }
}
