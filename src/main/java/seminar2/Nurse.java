package seminar2;

import seminar1.Animal;

public class Nurse {
    private String name;
    public void injectAnimal(Animal animal){
        System.out.println( getName() + " makes an injection to " + animal.getClass().getSimpleName());
    }

    public Nurse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
