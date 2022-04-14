import java.util.Arrays;

public class Work3 {
    public static void main(String[] args){
        int[] data = new int[100];
        for(int i = 0;i<100;i++){
            data[i] = i;
        }
        Pos pos = new Pos(data.length);
        Buy w1 = new Buy(pos,data,"一号");
        Buy w2 = new Buy(pos,data,"二号");
        Buy w3 = new Buy(pos,data,"三号");
        Buy w4 = new Buy(pos,data,"四号");
        w1.start();
        w2.start();
        w3.start();
        w4.start();

    }
}

class Buy extends Thread{
    private int data[];
    private int over[];
    private String name;
    private Pos pos;

    public Buy(Pos p,int[] d,String n){
        pos = p;
        data = d;
        name = n;
        over = new int[data.length];
    }

    public void run(){
        while (true){
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (pos){
                int x = pos.getPos();
                if(x==-1) return;
                int tic = data[x];
                System.out.println(name+"窗口售出"+tic+"号票");
            }
        }
    }
}

class Pos{
    private int max,pos;
    public Pos(int m){
        max = m;
        pos=0;
    }
    public int getPos(){
        if (pos==max) return -1;
        int x = pos; pos++; return x;
    }
}
