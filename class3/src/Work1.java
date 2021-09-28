import java.util.Scanner;

public class Work1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 2;
        int b = 1;
        int c = 0;
        double sum = 0;
        if(n < 2){
            System.out.println(2);
        }else{
            for(int i = 1;i<=n;i++){
                sum += (double)a/b;
                c = b;
                b = a;
                a = a+c;
            }
            System.out.println(sum);
        }
    }
}
