public class Work1 {
    public static void main(String[] args){
        String flag = "flag";
        String[] work1 = {"1","3","5","7","9"};
        String[] work2 = {"2","4","6","8","10"};
        String[] work3 = {"3","6","9","12"};
        Work_1 w1 = new Work_1(flag,"甲",work1);
        Work_1 w2 = new Work_1(flag,"乙",work2);
        Work_1 w3 = new Work_1(flag,"丙",work3);
        w1.start();
        w2.start();
        w3.start();

    }
}

class Work_1 extends Thread{
    private String flag;
    private String name;
    private String[] content;
    public Work_1(String f,String n,String[] c){
        flag = f;
        name = n;
        content = c;
    }
    public void run(){
        synchronized (flag){
            System.out.print(name+":");
            for(String x:content) System.out.print(" "+x);
            System.out.println();
        }
    }
}