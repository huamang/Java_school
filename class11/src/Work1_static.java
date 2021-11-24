public class Work1_static {
    public static int[] arr = new int[60];

    static {
        for (int i = 0; i < 60; i++) {
            arr[i] = i;
        }
    }

    public static void main(String[] argv){
        MyThread5 t1 = new MyThread5("3的倍数",0);
        MyThread5 t2 = new MyThread5("余数为1",1);
        MyThread5 t3 = new MyThread5("余数为2",2);
        t1.start();
        t2.start();
        t3.start();
    }
}

class MyThread5 extends Thread{


    public int num=3,num1;
    public MyThread5(String name,int num1){
        super(name);
        this.num1 = num1;
    }

    public void run(){

        while(num<60){
            if((num-num1)%3==0){
                System.out.println(getName()+"："+Work1_static.arr[num]);
            }
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            num++;
        }
    }

}

