import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Work1 extends JFrame implements ActionListener{

    private JButton b;
    private int c = 0;
    public Work1() {

        setSize(400,120);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        b = new JButton("点击");
        add(b);
        setVisible(true);

        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        c++;
        if(e.getSource() == b) {
            b.setText("点击"+c+"次");
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Work1();
    }

}
