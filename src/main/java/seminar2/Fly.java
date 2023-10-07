package seminar2;

import seminar1.Animal;

public class Fly extends Animal implements Flyable{
    private double speed;

    public Fly(String name, double speed) {
        super(name);
        this.speed = speed;
    }

    @Override
    public double getFlySpeed() {
        return this.speed;
    }

    @Override
    public void heal() {
    }
}
