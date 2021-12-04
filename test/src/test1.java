public class test1 {
    public static void main(String[] argv){
        testThread t1 = new testThread();
        t1.start();
        while(true){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2");
        }
    }


}

class testThread extends Thread{
    public void run(){
        while(true){
            try {
                sleep(1);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println("Thread 1");
        }

    }
}