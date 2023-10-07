package seminar2;

import seminar1.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic(new ArrayList<>());
        clinic.addAnimal(new Cat("barsik", 10, new Owner("Alex"), LocalDate.now(), List.of(new Vaccination("chumka", LocalDate.now())), Color.BLACK, "siam"));
        clinic.addAnimal(new Dog("barbos", 10, new Owner("Alex"), LocalDate.now(), List.of(new Vaccination("chumka", LocalDate.now())), Color.BLACK));
        clinic.addAnimal(new Bird("sparrow", 15.0));
        clinic.addAnimal(new Fly("Flyyy", 20.0));
        clinic.addAnimal(new Horse("Vector", 40.0));


        for (Animal animal : clinic.getPacients()) {
            if (animal instanceof Flyable){
                System.out.println(((Flyable) animal).getFlySpeed());
            }
            //animal.heal();
        }

        Nurse nurse = new Nurse("Liz");
        Doctor doctor = new Doctor("Ivan", new Nurse("Liz"));
        Animal Push = new Cat("Puh");
        doctor.asksToMakeInjection(nurse,Push);

        for (Animal animal: clinic.getPacients()) {
            if (animal instanceof Runable){
                System.out.println(((Runable) animal).getRunSpeed());
            }
        }
    }
}
