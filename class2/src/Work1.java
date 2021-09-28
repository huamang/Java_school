import java.util.Scanner;

public class Work1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        
        if((year % 4 == 0 && year % 100 !=0)||(year % 400 ==0 )){
            System.out.println("是闰年");
        }else{
            System.out.println("不是闰年");
        }
    }
}
