package animal;

public class Cow extends Animal1{
    @Override
    public void voice() {
        System.out.println("моуу");
    }

    public Cow(String name, int weight) {
        super(name, weight);

    }
}
