package seminar2;

import seminar1.Animal;

public class Horse extends Animal implements Runable {
    private double speed;

    public Horse(String name, double speed) {
        super(name);
        this.speed = speed;
    }

    @Override
    public double getRunSpeed() {
        return this.speed;
    }
}
