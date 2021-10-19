class A{
    public void a1(){System.out.println("调用a1方法");}
    public void a2(){System.out.println("调用a2方法");}
}
class B extends A{
    public void b1(){
        a1();
        a2();
        System.out.println("调用了b1方法");
    }
}

class C extends B{
    public void c1(){
        a1();
        a2();
        b1();
        System.out.println("调用了c1方法");
    }
}

public class Work1 {
    public static void main(String[] args){
        C c = new C();
        c.c1();
    }
}
