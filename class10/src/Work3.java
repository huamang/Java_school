import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Work3 extends JFrame implements KeyListener {
    private JTextField r,c,s;

    public Work3(){
        super("圆的周长和面积");
        setSize(300,100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        r = new JTextField("",5);
        c = new JTextField("",5);
        s = new JTextField("",5);

        add(r);
        add(c);
        add(s);
        setVisible(true);
        r.addKeyListener(this);

    }
    public String computeC(JTextField jf){
        double r = Double.parseDouble(jf.getText().trim());
        return String.valueOf(3.14*2*r);
    }

    public String computeS(JTextField jf){
        double r = Double.parseDouble(jf.getText().trim());
        return String.valueOf(3.14*r*r);
    }

    public void keyTyped(KeyEvent e) {
        if(e.getKeyChar() == '\n'){
            c.setText(computeC(r));
            s.setText(computeS(r));
        }
    }



    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public static void main(String[] argv){
        new Work3();
    }

}
