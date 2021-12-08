public class Work2 {
    static int sum = 0;
    public static void main(String[] args){
        int[] arr = new int[1000];
        for(int i=0;i<1000;i++){
            arr[i] = i;
        }
        for(int i=0;i<1000;i+=100){
            (new addSum(arr,i,i+99)).start();
        }
    }

}

class addSum extends Thread{
    int[] arr;
    int start,end;
    public addSum(int[] a,int s,int e){
        arr = a;
        start = s;
        end = e;
    }

    public synchronized void run(){
        for(int i = start;i<=end;i++){
            Work2.sum += arr[i];
            try {
                sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Work2.sum);
        }

    }

