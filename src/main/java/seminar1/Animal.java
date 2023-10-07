package seminar1;

import seminar2.Illable;

import java.time.LocalDate;
import java.util.List;

public class Animal implements Illable {
    protected String name;
    protected double weight;
    protected Owner owner;
    protected LocalDate birthDay;
    protected List<Vaccination> vaccinations;
    protected Color color;

    // константа, отражающая название класса с инициализацией не через конструктор, а через this
    protected final String TYPE = this.getClass().getSimpleName();

    protected void toFly(){
        System.out.println(this.TYPE + " fly");
    }
    protected void toSwim(){
        System.out.println(this.TYPE + " swim");
    }

    private void wakeUp() {
        System.out.println(this.TYPE + " woke Up");
    }

    private void findFood() {
        System.out.println(this.TYPE + " looking for food");
    }

    private void eat() {
        System.out.println(this.TYPE + " is eating");
    }

    private void toPlay() {
        System.out.println(this.TYPE + " is playing");
    }

    private void goToSleep() {
        System.out.println(this.TYPE + " is going to sleep");
    }

    private void makeSound() {
        System.out.println(this.TYPE + " making a sound");
    }

    public Animal(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color) {
        this.name = name;
        this.weight = weight;
        this.owner = owner;
        this.birthDay = birthDay;
        this.vaccinations = vaccinations;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public List<Vaccination> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(List<Vaccination> vaccinations) {
        this.vaccinations = vaccinations;
    }

    public Color getColor() {
        return color;
    }

    public String getTYPE() {
        return TYPE;
    }

    // Альтернативный конструктор без вакцины
    public Animal(String name, double weight, Owner owner, LocalDate birthDay, Color color) {
        this(name, weight, owner, birthDay, null, color);
    }

    public Animal(String name) {
        this.name = name;
    }

    // Инкапсуляция - реализация жизненного цикла кота в виде метода Public строго в определенном,
    // неизменяемом извне порядке, а отдельные методы становятся Private
    public void lifeCycle(){
        wakeUp();
        findFood();
        eat();
        toPlay();
        goToSleep();
    }

    @Override
    public void heal() {
        System.out.println("Veterinar heals " + this.getTYPE());
    }
}
