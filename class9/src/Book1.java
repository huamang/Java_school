
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.Color;
/*例4.1*/
public class Book1 extends JFrame{

    public Book1(){

        super("第一个简单界面");
        setSize(400,100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(new JLabel("账号:"));
        add(new JTextField(12));
        add(new JLabel("密码:"));
        add(new JTextField(12));
        add(new JButton("确定"));
        add(new JButton("退出"));
        setVisible(true);

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Book1();
    }

}
