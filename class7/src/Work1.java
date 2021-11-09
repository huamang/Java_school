class Mammal{
    protected int age = 2;
    protected int weight = 5;

    public Mammal(){
        System.out.print("Mammal constructor\n");
    }

    public Mammal(int age,int weight){
        this.age = age;
        this.weight = weight;
        System.out.print("Mammal constructor\n");
    }

    void move(){
        System.out.print("Mammal move one step\n");
    }

    void speak(){
        System.out.print("Mammal speak!\n");
    }

    void sleep(){
        System.out.print("Shhh.I'm sleeping\n");
    }
}

class Dog extends Mammal{
    public Dog(){;}

    public Dog(int age,int weight){
        super(age,weight);
    }

    void speak(){
        System.out.println("Woof!");
    }

    public void wag(){
        System.out.println("Tail wagging...");
    }

    void beg(){
        System.out.println("begging for food...");
    }
}

class Cat extends Mammal{
    public Cat(){;}

    public Cat(int age,int weight){
        super(age,weight);
    }

    void speak(){
        System.out.println("Meom!");
    }
}

public class Work1 {
    public static void main(String[] args){
        Mammal dog = new Dog();
        dog.speak();
        dog.move();
        dog.sleep();

        Mammal cat = new Cat();
        cat.speak();
        cat.move();
        cat.sleep();
    }
}
