package stragePattern;

public class StragePatternInterfaceAndImpl {
    public interface Animal{
        void sound();
    }

    public static class Cat implements  Animal{
        @Override
        public void sound() {
            System.out.println("야옹");
        }
    }

    public static class Dog implements  Animal{
        @Override
        public void sound() {
            System.out.println("멍멍");
        }
    }
}
