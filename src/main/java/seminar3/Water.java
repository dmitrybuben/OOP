package seminar3;

public class Water extends Component{
    public Water(String name, int power, String weight) {
        super(name, power, weight);
    }

    public Water(String weight) {
        this("water", 1, "10mg");
    }
}
