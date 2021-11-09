public class Work1 {
    public static void main(String[] argv){
        String txt = "1.2 + 3.4 * (5.6 - 7.8 / (9.0 - 10) )";

        //字符
        String[] a = txt.split("[-+*/)( ]+");
        System.out.println("操作数===============");
        for(String x:a) {
            System.out.print(x + ' ');
        }
        //运算符
        String[] b = txt.split("[\\d. ]+");
        System.out.println("\n运算符===============");
        for(String x:b) {
            System.out.print(x + ' ');
        }
    }
}
