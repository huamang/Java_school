import java.util.Scanner;

public class Work5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int sum = 0;
        for(int i=m;i<=n;i++){
            if(su(i)){
                sum += i;
            }
        }
        System.out.println(sum);


    }
    // 判断素数的函数
    public static boolean su(int n){
        if (n <= 3) {
            return true;
        }
        for (int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
