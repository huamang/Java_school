class Vehicle{

    public String name;
    public double speed;

    public Vehicle(){;}

    public Vehicle(String name,double speed){
        this.name = name;
        this.speed = speed;
    }

    public void move(){
        System.out.printf("%.2f/h\n",speed);
    }

}

class Bicycle extends Vehicle{
    public Bicycle() {;}
    public Bicycle(String name,double speed){
        this.name = name;
        this.speed = speed;
    }

    public void move(){
        System.out.printf("%.2f/h\n",speed);
        System.out.println("叮叮当当");
    }

}

class Car extends Vehicle{
    public Car() {;}
    public Car(String name,double speed){
        this.name = name;
        this.speed = speed;
    }

    public void move(){
        System.out.printf("%.2f/h\n",speed);
        System.out.println("滴滴滴");
    }

}

public class Work2 {
    public static void main(String[] args){
        Vehicle b = new Bicycle("Bicycle",1);
        b.move();

        Vehicle c = new Car("Car",10);
        c.move();

    }
}
