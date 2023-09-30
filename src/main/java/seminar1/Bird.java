package seminar1;

import java.time.LocalDate;
import java.util.List;

public class Bird extends Animal{

    @Override
    protected void toSwim() {
        System.out.println("I am not able to swim!");
    }

    public Bird(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color) {
        super(name, weight, owner, birthDay, vaccinations, color);
    }
}
