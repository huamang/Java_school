import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Work6{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random ran = new Random();
        int r = ran.nextInt(99)+1;
        while (true){
            int m = in.nextInt();
            if(m==r){
                System.out.println("success!");
                break;
            }
            else if(m<r){
                System.out.println("Too small!");
                continue;
            }
            else{
                System.out.println("Too big!");
                continue;
            }
        }
    }
}
