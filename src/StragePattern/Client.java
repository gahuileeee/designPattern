package StragePattern;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        context.setAnimal(new StragePatternInterfaceAndImpl.Cat());
        context.sound();

        context.setAnimal(new StragePatternInterfaceAndImpl.Dog());
        context.sound();
    }
}
