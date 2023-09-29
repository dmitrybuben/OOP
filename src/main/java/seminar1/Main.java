package seminar1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Owner Alex = new Owner("Alexey");
        Vaccination chumka = new Vaccination("chumka", LocalDate.of(2010, 12, 5));
        Animal barsik = new Cat("barsik", 10, Alex, LocalDate.now(), List.of(chumka), Color.BLACK, "siam");
        System.out.println(barsik.getName());
        System.out.println(barsik.getTYPE());
        //barsik.wakeUp();
        System.out.println(barsik.getVaccinations());
        barsik.setVaccinations(List.of(chumka, new Vaccination("stolbnyak", LocalDate.now())));
        System.out.println(barsik.getVaccinations());
        Dog barbos = new Dog("barbos", 10.0, Alex, LocalDate.now(), List.of(chumka), Color.WHITE);
        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(barbos);
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                System.out.println(((Cat)animal).getBreed());
            }
            System.out.println(animal.getName());
        }
        //Dowcasting from Animal to Cat - приведение вниз
        ((Cat)barsik).getBreed();

        Animal bar = new Cat("one", 10, Alex, LocalDate.now(), null, Color.BLACK, "super");
        System.out.println(bar.getVaccinations());

        /*barsik.wakeUp();
        barsik.findFood();
        barsik.eat();
        barsik.toPlay();
        barsik.goToSleep();*/

        // сокрыта реализация метода жизненного цикла кота - поломать ее не смогут
        barsik.lifeCycle();
    }
}
