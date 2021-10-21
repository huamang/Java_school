class Animal{
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("吃...");
    }
    public void sleep(){
        System.out.println("睡...");
    }
}

class Dog extends Animal{
    String Owner;

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public void bark(){
        System.out.println("汪汪汪...");
    }

}

public class Work3 {
    public static void main(String[] args){
        Dog d = new Dog();
        d.setOwner("小明");
        d.setAge(2);
        d.setName("小白");

        d.bark();
        d.sleep();
        d.eat();
    }
}
