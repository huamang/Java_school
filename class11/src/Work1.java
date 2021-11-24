public class Work1 {
    public static void main(String[] argv){
        int[] arr = new int[60];
        for (int i=0;i<60;i++) {
            arr[i] = i;
        }
        MyThread3 t1 = new MyThread3("3的倍数",0,arr);
        MyThread3 t2 = new MyThread3("余数为1",1,arr);
        MyThread3 t3 = new MyThread3("余数为2",2,arr);
        t1.start();
        t2.start();
        t3.start();
    }

}

class MyThread3 extends Thread{
    public int arr[];
    public int num=3,num1;
    public MyThread3(String name,int num1,int[] arr){
        super(name);
        this.num1 = num1;
        this.arr = arr;
    }

    public void run(){

        while(num<60){
            if((num-num1)%3==0){
                System.out.println(getName()+"："+arr[num]);
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
