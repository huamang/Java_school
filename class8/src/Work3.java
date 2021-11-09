import java.util.Random;

public class Work3 {
    public static void main(String[] argv){
        double r = 1;
        int n = 99999999;
        double x,y,m = 0;
        Random rand = new Random();
        for(int i = 0;i<n;i++){
            x = rand.nextDouble()*2;
            y = rand.nextDouble()*2;
            //判断点是否在圆内
            if(Math.sqrt((x-r)*(x-r) + (y-r)*(y-r))<=r){
                m++;
            }
        }

        System.out.println(4*m/n);
    }

}
