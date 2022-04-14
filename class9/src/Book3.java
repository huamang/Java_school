import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
/*例4.3*/
public class Book3 extends JFrame implements ActionListener,KeyListener,WindowListener{

    private JTextField userName;
    private JPasswordField password;
    private JButton b_ok,b_exit;
    private JLabel t_la;

    public Book3(){

        super("登入界面");
        setSize(500,100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());
        userName = new JTextField(5);
        b_ok = new JButton("确定");
        b_exit = new JButton("退出");
        t_la = new JLabel(" ");
        password = new JPasswordField(5);

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
        // 键盘事件
        b_ok.addKeyListener(this);
        userName.addKeyListener(this);
        password.addKeyListener(this);
        this.addWindowListener(this);

    }

    private void click_btOk() {

        String keyText = String.valueOf(password.getPassword());
        if(userName.getText().equals("abc") && keyText.equals("1234"))
            t_la.setText("欢迎您,abc!");
        else
            t_la.setText("账号或密码错误！");
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == b_exit)
            System.exit(0);
        if(e.getActionCommand().equals("确定"))
            click_btOk();

    }

    //下面3个方法由KeyListener接口提供
    // 由requestFocusInWindow设置焦点
    public void keyTyped(KeyEvent e) {
        if(e.getKeyChar() == '\n')
            if(e.getSource() == userName)
                password.requestFocusInWindow();
            else if(e.getSource() == password)
                b_ok.requestFocusInWindow();
            else if(e.getSource() == b_ok)
                click_btOk();
    }


    // 剩余接口方法的实现
    public void keyPressed(KeyEvent e) {;}
    public void keyReleased(KeyEvent e) {;}

    public void windowClosing(WindowEvent e) {System.exit(0);}
    public void windowOpened(WindowEvent e) {;}
    public void windowActivated(WindowEvent e) {;}
    public void windowDeactivated(WindowEvent e) {;}
    public void windowClosed(WindowEvent e) {;}
    public void windowIconified(WindowEvent e) {;}
    public void windowDeiconified(WindowEvent e) {;}

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Book3();
    }

}

