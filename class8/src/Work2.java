public class Work2 {
    public static void main(String[] argv){
        String s = "192.168.9.1 sadsd 123.456.89.9 cxv000.000.111.000";

        // 0-255 第一个数字单独匹配，剩下字符里面，点和数字可以一起匹配三次
        String patten = "([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d)(\\.([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d)){3}";
        String[] i = s.split(" ");
        for (String x:i){
            if(x.matches(patten)){
                System.out.println(x);
            }
        }
    }
}
