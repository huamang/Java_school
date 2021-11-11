import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Work2 {
    public static void main(String[] argv){
        JTextField jt1 = new JTextField();
        JTextField jt2 = new JTextField();
        JTextField jt3 = new JTextField();
        JButton b = new JButton("=");

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = jt1.getText();
                String num2 = jt3.getText();
                String symbol = jt2.getText();


            }
        });
    }

    public double figure(String num1, String num2, String symbol){
        double n1 = Double.parseDouble(num1);
        double n2 = Double.parseDouble(num2);
        if(symbol == "+"){
            return n1+n2;
        }
        else if(symbol == "-"){
            return n1-n2;
        }
        else if(symbol == "*"){
            return n1*n2;
        }
        else if(symbol == "/"){
            return n1*n2;
        }
        else {
            return 0;
        }
    }

}


class NullTextFieldException extends Exception {

    public NullTextFieldException() {
    }

    public NullTextFieldException(String s) {
        super(s);
    }

}
