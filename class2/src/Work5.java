import java.util.Scanner;
// 求最大公约数
public class Work5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int tmp = 0;
        // 统一数字大小，a>b
        if (a < b) {
            tmp = a;
            a = b;
            b = tmp;
        }

        tmp = b;
        while (tmp <= a && tmp <= b) {
            if (a % tmp == 0 && b % tmp == 0) {
                System.out.println(tmp);
                break;
            }
            tmp--;
        }
    }
}
