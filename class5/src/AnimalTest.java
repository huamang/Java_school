class Animal1{
    public void eat(){System.out.println("吃饭");}
    public void sleep(){System.out.println("睡觉");}
}
class Rabbit extends Animal1{
    @Override
    public void eat() {
        System.out.println("兔子吃草");
    }
}

class Tiger extends Animal1{
    @Override
    public void eat() {
        System.out.println("老虎吃肉");
    }
}

public class AnimalTest {
    public static void main(String[] args){
        Rabbit r = new Rabbit();
        Tiger t = new Tiger();
        System.out.println("兔子的行为");
        r.eat();r.sleep();
        System.out.println("老虎的行为");
        t.eat();t.sleep();
    }
}
