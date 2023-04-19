package animal;

public class Cat extends Animal1{
    @Override
    public void voice() {
        System.out.println("мяу мяу");
    }

    public Cat(String name, int weight) {
        super(name, weight);

    }
}
