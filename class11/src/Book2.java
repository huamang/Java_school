// 用runnable构造线程

public class Book2 {
    public static void main(String[] argv){
        System.out.println("开始");
        MyThread2 m1,m2,m3;
        Thread t1,t2,t3;
        m1 = new MyThread2(2,70);
        m2 = new MyThread2(3,70);
        m3 = new MyThread2(5,70);
        t1 = new Thread(m1,"A");
        t2 = new Thread(m2,"B");
        t3 = new Thread(m3,"C");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("当前共有"+Thread.activeCount()+"个线程");
        System.out.println("Main结束");
    }
}

class MyThread2 implements Runnable{
    private int n,max;

    public MyThread2(int n1,int max1){
        n = n1;
        max = max1;
    }
    @Override
    public void run() {
        int i = 1;
        while(n*i<=max){
            System.out.println(n*i+" ");
            i++;
        }
        System.out.println(Thread.currentThread().getName()+"结束");
    }
}
