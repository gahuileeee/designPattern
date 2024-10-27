package stragePattern;

public class Context {
    StragePatternInterfaceAndImpl.Animal animal;

    //전략 교체 메소드
    void setAnimal(StragePatternInterfaceAndImpl.Animal animal){
        this.animal = animal;
    }

    //전략 실행 메소드
    public void sound(){
        this.animal.sound();
    }
}
