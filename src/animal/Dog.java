package animal;

public class Dog extends Animal1{
    @Override
    public void voice() {
        System.out.println("ваф ваф");
    }

    public Dog(String name, int weight) {
        super(name, weight);

    }
}
