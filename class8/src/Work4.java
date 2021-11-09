public class Work4 {
    public static void main(String[] argv) {
        String s = "test";
        try {
            throw new Exception(s+"\n");
        } catch (Exception a) {
            System.out.print(a.getMessage());
        } finally {
            System.out.println("OK");
        }
    }
}
