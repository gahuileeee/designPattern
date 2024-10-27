package stragePattern;



public class DeligateEx {

    //deligate
    class DeligateObject{
        public void show(){
            System.out.println("show");
        }

        public void eat(){
            System.out.println("eat");
        }
    }

   DeligateObject deligateObject = new DeligateObject();

    public void methodA(){
        deligateObject.show();
        deligateObject.eat();
    };
}
