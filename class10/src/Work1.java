import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Work1 extends JFrame implements ActionListener {
    private JTextField op1,op2,result;
    private JLabel opChar;
    private JButton bt_c;
    private String[] bt_Label = {"1","2","3","4","5","6","7","8","9","0","+","-","*","/","="};
    private JButton[] bt = new JButton[bt_Label.length];
    private boolean isOp1 = true;

    public Work1(){
        super("计算器");
        setSize(500,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 第一个面板
        JPanel p1 = new JPanel();
        op1 = new JTextField("",5);
        opChar = new JLabel("?");
        op2 = new JTextField("",5);
        bt_c = new JButton("C");
        result = new JTextField("",10);
        p1.add(op1);
        p1.add(opChar);
        p1.add(op2);
        p1.add(new JLabel("="));
        p1.add(result);
        p1.add(bt_c);
        op1.setEditable(false);
        op2.setEditable(false);
        result.setEditable(false);
        bt_c.addActionListener(this);
        // 方位在最上面
        add(p1, BorderLayout.NORTH);

        // 下方按钮集合
        // 第二个面板
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(3,5,5,5));
        // 通过循环把大量按钮添加进panel
        for(int i=0;i<bt.length;i++){
            bt[i] = new JButton(bt_Label[i]);
            bt[i].addActionListener(this);
            p2.add(bt[i]);
        }
        // 方位位于中间
        add(p2,BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("C")){
            op1.setText("");
            op2.setText("");
            opChar.setText("?");
            result.setText("");
            isOp1 = true;
            return;
        }

        if("0123456789".indexOf(e.getActionCommand()) >= 0){
            if(isOp1 && op1.getText().length()<5){
                op1.setText(op1.getText()+e.getActionCommand());
            }
        else if(!isOp1 && op2.getText().length()<5){
            op2.setText(op2.getText()+e.getActionCommand());
            }
        return;
        }

        if("+-*/".indexOf(e.getActionCommand())>=0){
            opChar.setText(e.getActionCommand());
            isOp1=false;
            return;
        }

        if(e.getActionCommand().equals("=")) {
            isOp1 = true;
            if (op1.getText().equals("") || op2.getText().equals("")) {
                result.setText("不能计算");
                return;
            }
            int x, y;
            char op = opChar.getText().charAt(0);
            x = Integer.parseInt(op1.getText());
            y = Integer.parseInt(op2.getText());
            result.setText(compute(x, y, op));
        }

    }

    // 计算
    public String compute(int x,int y,char op) {
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
        new Work1();
    }

}
