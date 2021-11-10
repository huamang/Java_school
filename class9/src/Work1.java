import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Work1 {
    public static void main(String[] argv){
        final int[] c = {0};
        JFrame f = new JFrame("test");
        f.setSize(300,300);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JButton b = new JButton();
        b.setText("点击");

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                c[0]++;
                b.setText("点击"+c[0]+"次");
            }
        });
        panel.add(b);
        f.setContentPane(panel);
        f.setVisible(true);
    }
}
