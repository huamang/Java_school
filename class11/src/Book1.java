public class Book1 {
    public static void main(String[] argv){
        System.out.println("开始");
        MyThread m1 = new MyThread("A",2,70);
        MyThread m2 = new MyThread("B",3,70);
        MyThread m3 = new MyThread("C",5,70);
        m1.start();
        m2.start();
        m3.start();
        System.out.println("当前有"+Thread.activeCount()+"个线程");
        System.out.println("main结束");
    }
}

class MyThread extends Thread{
    private int n,max;
    public MyThread(String name,int n1,int max1){
        super(name);
        n = n1;
        max = max1;
    }

    public void run() {
        int i = 1;
        while(n*i<=max){
            System.out.println(n*i+" ");
            i++;
        }
        System.out.println(getName()+"结束");
    }
}