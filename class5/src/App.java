class BoneSmell{;}
class MasterSmell{;}
class TigerSmell{;}
class Persion{
    private int blood = 100;
    public int getBlood(){ return blood;}
    public void setBlood(int x){ blood = (x<0||x>100)?blood:x;}
    public String toString(){return "blood:"+blood;}
}

class Animal{
    public Animal(){System.out.println("调用构造函数:Animal()");}
}

class Dog extends Animal{
    public Dog(){ System.out.println("调用构造函数：Dog()"); }
    void smell (BoneSmell b){ System.out.println("哦，美味的骨头"); }
    void smell (TigerSmell t){System.out.println("老虎，太可怕了，投降");}
    void smell (MasterSmell m){System.out.println("主人，见到你很开心！");}
    public void bite(Persion p){
        System.out.println("狗咬人，人掉10滴血");
        p.setBlood(p.getBlood()-10);
    }
}

class Teddy extends Dog{
    public Teddy(){ System.out.println("调用构造函数Teddy()"); }
    public void bite(Persion p){
        System.out.println("泰迪咬人，人掉1滴血");
        p.setBlood(p.getBlood()-1);
    }
}

class TibetanMastiff extends Dog{
    public TibetanMastiff(){ System.out.println("调用构造函数TibetanMastiff"); }
    public void bite(Persion p){
        System.out.println("藏獒咬人，人掉50滴血");
        p.setBlood(p.getBlood()-50);
    }
}

public class App {
    public static void main(String[] args){
        Persion p = new Persion();
        System.out.println("构造子类对象时会自动调用超类的构造方法");
        System.out.println("构造Dog对象");
        Dog d = new Dog();
        System.out.println("构造Teddy对象");
        Teddy td = new Teddy();
        System.out.println("构造TibetanMastiff对象");
        TibetanMastiff t = new TibetanMastiff();
        System.out.println("泰迪对不同气味有不同反应");
        td.smell(new BoneSmell());td.smell(new MasterSmell());td.smell(new TigerSmell());
        System.out.println("验证bite方法装置不同的对象会有不同的效果");
        System.out.println("人被咬前的状态"+p);
        System.out.println("人被泰迪咬了");
        Dog pp = td;pp.bite(p);System.out.println(p);
        System.out.println("人被藏獒咬了");
        pp = t;pp.bite(p);System.out.println(p);
    }
}
