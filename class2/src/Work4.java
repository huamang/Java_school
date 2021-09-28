import java.util.Scanner;

public class Work4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n <= 3) {
            System.out.println("是素数");
        }
        // 这里利用开根来减小循环次数
        int sqrt = (int)Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if(n % i == 0) {
                System.out.println("不是素数");
            }else{
                System.out.println("是素数");
            }
            break;
        }
    }
}
