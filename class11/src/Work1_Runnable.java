public class Work1_Runnable {
    public static void main(String[] argv){
        MyThread4 r1 = new MyThread4(0);
        MyThread4 r2 = new MyThread4(1);
        MyThread4 r3 = new MyThread4(2);
        Thread t1 = new Thread(r1,"3的倍数");
        Thread t2 = new Thread(r2,"余数为1");
        Thread t3 = new Thread(r3,"余数为2");
        t1.start();
        t2.start();
        t3.start();
    }
}

class MyThread4 extends arr implements Runnable{
    public int num=3,num1;
    public MyThread4(int num1){
        this.num1 = num1;
    }

    public void run(){
        while(num<60){
            if((num-num1)%3==0){
                System.out.println(Thread.currentThread().getName()+"："+arr[num]);
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            num++;
        }
    }
}

class arr{
    public int arr[] = new int[60];
    public arr(){
        for (int i=0;i<60;i++) {
            arr[i] = i;
        }
    }
}
