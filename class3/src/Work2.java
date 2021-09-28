import java.util.Scanner;

public class Work2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int n = in.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            String s = Integer.toString(a);
            String ss = s;
            for(int x=1;x<i;x++){
                ss += s;
            }
            sum += Integer.parseInt(ss);
        }
        System.out.println(sum);
    }
}
