import java.util.Scanner;

public class Work2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double i = in.nextDouble();
        double result = i;
        
        for(double n = 1;n<i;n++){
            result *= n;
        }
        System.out.println(result);
    }
}
