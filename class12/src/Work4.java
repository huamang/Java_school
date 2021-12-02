public class Work4 {
    public static void main(String[] args){
        MyThread t1 = new MyThread(2,"二的倍数");
        MyThread t2 = new MyThread(3,"三的倍数");
        MyThread t3 = new MyThread(5,"五的倍数");
        t1.start();
        t2.start();
        t3.start();
    }

}

class MyThread implements Runnable{
    private int num ;
    private String name;
    private Thread th;
    public MyThread(int n,String na){
        num = n;
        name = na;
        th = new Thread(this,name);
    }

    public void start() {
        th.start();
    }

    public void run(){
        for(int i = 1;i<21;i++){
            System.out.println(name+"的"+i+"倍:"+(num*i));
        }
    }

}