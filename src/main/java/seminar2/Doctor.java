package seminar2;

import seminar1.Animal;
import seminar1.Cat;

public class Doctor {
    private String name;
    private Nurse nurse;
    public void asksToMakeInjection(Nurse nurse, Animal animal){
        System.out.println("Doctor asks " + nurse.getName() + " to make an injection to " + animal.getClass().getSimpleName());
        nurse.injectAnimal(animal);
    }

    public Doctor(String name, Nurse nurse) {
        this.name = name;
        this.nurse = nurse;
    }
}
