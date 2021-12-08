public class Work1 {
    static int count = 1;

    public static void main(String[] args){
        String[] a = {"1","3","5","7","9"};
        String[] b = {"2","4","6","8","0"};
        String[] c = {"a","b","c","d","e"};
        Source out = new Source();
        OutPut out1 = new OutPut(out,a);
        OutPut out2 = new OutPut(out,b);
        OutPut out3 = new OutPut(out,c);
        out1.start();
        out2.start();
        out3.start();
        try {
            out1.join();
            out2.join();
            out3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("结束");
    }
}


class Source {
    public void outStr(String data){
        System.out.print(data);
        if (Work1.count % 3 == 0) {
            Work1.count++;
            notifyAll();
        }else{
            try {
                Work1.count++;
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class OutPut extends Thread {
    private Source sou;
    private String[] data;
    private final int turn = 5;
    public OutPut(Source s,String[] a){
        sou = s;
        data = a;
    }

    public void run(){
        for(int i = 0;i<turn;i++){
            synchronized(sou){
                sou.outStr(data[i]);
            }
        }
    }

}



