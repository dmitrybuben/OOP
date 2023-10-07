package seminar2;

import seminar1.Animal;

import java.util.List;

// Финальный класс не может иметь наследников
public final class VeterinaryClinic {
    private List<Animal> pacients;
    public VeterinaryClinic(List<Animal> pacients) {
        this.pacients = pacients;
    }
    public void addAnimal(Animal animal){
        pacients.add(animal);
    }

    public List<Animal> getPacients() {
        return pacients;
    }
}

