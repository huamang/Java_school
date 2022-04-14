import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*例4.2*/
public class Book2 extends JFrame implements ActionListener{
    // 实现这个登录界面，需要两个按钮，一个登录，一个退出
    private JButton b_ok,b_exit;
    // 登录成功的时候输出的文本框
    private JLabel t_la;
    // 输入用户名的文本框
    private JTextField userName;
    // 输入密码的密码框
    private JPasswordField password;

    public Book2() {

        super("登入界面");
        setSize(500,100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());
        userName = new JTextField(5);
        password = new JPasswordField(5);
        b_ok = new JButton("确定");
        b_exit = new JButton("退出");
        t_la = new JLabel(" ");
        add(new JLabel("账号:"));
        add(userName);
        add(new JLabel("密码:"));
        add(password);
        add(b_ok);
        add(b_exit);
        add(t_la);
        setVisible(true);

        b_exit.addActionListener(this);
        b_ok.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == b_exit)
            System.exit(0);
        if(e.getActionCommand().equals("确定")) {

            String KeyText =String.valueOf(password.getPassword());//获取密码框文本
            if(userName.getText().equals("abc") && KeyText.equals("1234"))
                t_la.setText("欢迎您,abc!");
            else
                t_la.setText("账号或密码错误！");
            setVisible(true);
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Book2();
    }

}
