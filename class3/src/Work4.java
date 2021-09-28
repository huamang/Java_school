import java.util.Scanner;

public class Work4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a,b,c;
        int sum = 0;
        // 穷举出所有的n位数字
        for(int i=pow(10,n-1);i<pow(10,n);i++){
            a = i;
            // 用取余来获取每一位的数字
            for(int j=1;j<=n;j++){
                b = a%10;
                a = a/10;
                sum += pow(b,n);
            }
            if(sum==i){
                System.out.println(sum);
            }
            sum = 0;
        }
    }
    // 定义幂方法
    public static int pow(int a,int n){
        int b = a;
        for(int i=1;i<n;i++){
            a *= b;
        }
        return a;
    }
}
