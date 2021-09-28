import java.util.Scanner;
// 乘法持久性计算
public class Work6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int count = 0;
        
        while(s.length()>1){
            int new_int = 1;
            for(int i = 0;i < s.length();i++){
                // 遍历字符串,再转为int类型进行乘法运算
                int each = Integer.parseInt(s.substring(i,i+1));
                new_int *= each;
            }
            // 第一次乘完的结果作为第二次循环的字符串，再把数字转换成字符串
            s = Integer.toString(new_int);
            count ++;
        }
        System.out.println(count);
    }
}
