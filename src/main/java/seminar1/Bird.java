package seminar1;

import seminar2.Flyable;

import java.time.LocalDate;
import java.util.List;

public class Bird extends Animal implements Flyable {
    private double speed;

    @Override
    protected void toSwim() {
        System.out.println("I am not able to swim!");
    }

    public Bird(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color) {
        super(name, weight, owner, birthDay, vaccinations, color);
    }

    public Bird(String name, double speed) {
        super(name);
        this.speed = speed;
    }

    @Override
    public double getFlySpeed() {
        return this.speed;
    }
}
