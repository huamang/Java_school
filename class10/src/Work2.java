import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Work2 extends JFrame implements ActionListener {
    private JButton bt_add,bt_sub,bt_mul,bt_div;
    private JTextField num1,num2,result;

    public Work2(){
        super("计算器");
        setSize(400,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        bt_add = new JButton("加");
        bt_sub = new JButton("减");
        bt_mul = new JButton("乘");
        bt_div = new JButton("除");
        num1 = new JTextField("",5);
        num2 = new JTextField("",5);
        result = new JTextField("",8);
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

        p1.add(num1);
        p1.add(num2);
        p1.add(result);
        p2.add(bt_add);
        p2.add(bt_sub);
        p2.add(bt_mul);
        p2.add(bt_div);
        add(p1, BorderLayout.NORTH);
        p2.setLayout(new GridLayout(1,4));
        add(p2,BorderLayout.CENTER);
        setVisible(true);

        bt_add.addActionListener(this);
        bt_sub.addActionListener(this);
        bt_mul.addActionListener(this);
        bt_div.addActionListener(this);

    }


    public void actionPerformed(ActionEvent e){
        double n1,n2;
        n1 = getnum(num1);
        n2 = getnum(num2);
        if(e.getActionCommand().equals("加")){
            result.setText(compute(n1,n2,'+'));
            return;
        }
        if(e.getActionCommand().equals("减")){
            result.setText(compute(n1,n2,'-'));
            return;
        }
        if(e.getActionCommand().equals("乘")){
            result.setText(compute(n1,n2,'*'));
            return;
        }
        if(e.getActionCommand().equals("除")){
            result.setText(compute(n1,n2,'/'));
            return;
        }

    }



    // 获取操作数
    public double getnum(JTextField jf){
        double x;
        String s = jf.getText().trim();
        x = Double.parseDouble(s);
        return x;
    }


    // 计算
    public String compute(double x,double y,char op) {
        double r = 0;
        if (y == 0 && op == '/')
            return "除零错";
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
        return String.valueOf(r);
    }

    public static void main(String[] argv){
        new Work2();
    }

}
