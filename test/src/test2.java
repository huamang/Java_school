
public class test2 {
    public static void main(String[] argv){
        System.out.println("开始");
        MyThread2 m1,m2;
        m1 = new MyThread2(1,"第一个");
        m2 = new MyThread2(3,"第二个");
        m1.start();
        m2.start();

        System.out.println("当前共有"+Thread.activeCount()+"个线程");
        System.out.println("Main结束");
    }
}

class MyThread2 implements Runnable{
    private int n;
    private Thread t;

    public MyThread2(int n1,String name){
        n = n1;
        t = new Thread(this,name);
    }
    //这里不是对Thread类的start方法的重写
    public void start(){
        t.start();
    }

    @Override
    public void run() {
        System.out.println(n);
        System.out.println(Thread.currentThread().getName()+"结束");
    }
}

