import java.util.Scanner;

public class Work3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i,j,k;
        // 三层循环嵌套，第二层开始，判断重复数字
        for(i=n;i<=n+3;i++){
            for(j=n;j<=n+3;j++){
                if(i==j)
                    continue;
                for(k=n;k<=n+3;k++){
                    if(i==k||j==k)
                        continue;
                    System.out.printf("%d%d%d ",i,j,k);
                }
            }
        }
    }
}
