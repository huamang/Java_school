import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Work2 extends JFrame implements ActionListener {
    private JButton b;
    private JTextField num1, num2, result, operator;
    private JLabel err;

    public Work2() {
        super("计算器");
        setSize(500,200);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        num1 = new JTextField("",8);
        operator = new JTextField("",1);
        num2 = new JTextField("",8);
        result = new JTextField("",15);
        err = new JLabel(" ");
        b = new JButton("=");
        result.setEditable(false);
        add(num1);
        add(operator);
        add(num2);
        add(result);
        add(err);
        add(b);

        setVisible(true);

        b.addActionListener(this);
    }


    // 获取操作数
    public double getNum(JTextField jf,int num) throws NoneException,NumberFormantException{
        double numb;
        String s = jf.getText().trim();
        if(s.length() == 0)
            throw new NoneException("错误：第"+num+"个操作数为空");
        try {
            numb = Double.parseDouble(s);
        }
        catch(NumberFormatException e){
            throw new NumberFormantException("错误：第"+num+"个操作数数据格式错误");
        }
        return numb;
    }

    // 获取操作符
    public char getOp(JTextField jf) throws OpCharException{
        String s = jf.getText().trim();
        if(s.length() == 0) throw new OpCharException("错误：运算符为空");
        if(s.length() > 1) throw new OpCharException("错误：运算符过多");
        if("+-*/".indexOf(s)<0) throw new OpCharException("错误：无法识别的运算符");
        return s.charAt(0);
    }

    // 计算
    public double compute(double x,double y,char op) {
        double r = 0;
        if (y == 0 && op == '/')
            throw new ArithmeticException("错误：除零错误");
        switch (op) {
            case '+':
                r = x + y;
                break;
            case '-':
                r = x - y;
                break;
            case '*':
                r = x * y;
                break;
            case '/':
                r = x / y;
                break;
        }
        return r;
    }

    private void clickEq() {

        double x,y,r;
        char c;
        //String r;

        try {
            x = getNum(num1,1);
            y = getNum(num2,2);
            c = getOp(operator);
            r = compute(x,y,c);
            result.setText(String.valueOf(r));//数字转字符串
            err.setText(" ");
        }
        catch(Exception xx) {
            result.setText("");
            err.setText(xx.getMessage());
        }
        b.setText("clear");
        num1.setEditable(false);
        num2.setEditable(false);
        operator.setEditable(false);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b) {
            if(b.getActionCommand().equals("=")) {
                clickEq();
            }
            else {
                num1.setText("");
                num2.setText("");
                operator.setText("");
                result.setText("");
                err.setText("");
                b.setText("=");
                num1.setEditable(true);
                num2.setEditable(true);
                operator.setEditable(true);
            }
        }
    }



    public static void main(String[] argv) {
        new Work2();

    }


    class NoneException extends Exception {
        public NoneException(String msg) {
            super(msg);
        }
    }

    class OpCharException extends Exception {
        public OpCharException(String msg) {
            super(msg);
        }
    }

    class NumberFormantException extends Exception {
        public NumberFormantException(String msg) {
            super(msg);
        }
    }
}
