import java.sql.SQLOutput;
import java.util.Scanner;
// 斐波那契数列
public class Work3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n < 1) {
            System.out.println("数值无效");
        }else if(n == 1 || n == 2) {
            System.out.println(1);
        }

        int a = 1;
        int b = 1;
        int tmp = 0;
        
        for(int i = 3;i<=n;i++){
            tmp = b;
            b = a + b;
            a = tmp;
        }
        System.out.println(b);
    }
}
