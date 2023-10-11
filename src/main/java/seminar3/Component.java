package seminar3;

public class Component {
    private String name;
    private int power;
    private String weight;

    public Component(String name, int power, String weight) {
        this.name = name;
        this.power = power;
        this.weight = weight;
    }


    public void setWeight(String weight) {
        this.weight = weight;
    }

    // Getter для получения силы component in Pharmacy - для сравнения лекарств по силе посредством
    // Comparable.
    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", weight='" + weight + '\'' +
                '}';
    }

}
