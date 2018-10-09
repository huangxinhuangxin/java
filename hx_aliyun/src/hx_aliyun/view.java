package hx_aliyun;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class view {
public static void main(String[] args){
        
        JFrame frame = new JFrame();    
        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel("发送消息:");
        JLabel label2 = new JLabel("接收消息:");
        JTextField jtf_1 = new JTextField(10);
        JTextField jtf_2 = new JTextField(10);
        JButton button1 = new JButton("发送消息");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                method_1(jtf_1.getText().toString());
            }
        });
        JButton button2 = new JButton("接收消息");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	jtf_2.setText(method_2());
            }
        });
        Font font2 = new Font("SansSerif",Font.BOLD,25);
        Font font3 = new Font("SansSerif",Font.BOLD,35);
        ImageIcon icon1 = new ImageIcon("1.png");
        ImageIcon icon2 = new ImageIcon("2.png");
        ImageIcon icon3 = new ImageIcon("3.png");
        ImageIcon icon4 = new ImageIcon("4.png");
        ImageIcon icon5 = new ImageIcon("5.png");
        
        frame.add(panel1);
        panel1.setSize(460, 220);
        panel1.setLocation(60, 20);
        panel1.setLayout(new GridLayout(3,2,40,35));
        panel1.add(label1);
        panel1.add(jtf_1);
        panel1.add(label2);
        panel1.add(jtf_2);
        panel1.add(button1);
        panel1.add(button2);
        label1.setFont(font2);
        label2.setFont(font2);
        button1.setFont(font3);
        button2.setFont(font3);
        label1.setIcon(icon2);
        label2.setIcon(icon3);
        button1.setIcon(icon4);
        button2.setIcon(icon5);
        label1.setForeground(Color.BLUE);
        label2.setForeground(Color.BLUE);
        button1.setForeground(Color.BLUE);
        button2.setForeground(Color.BLUE);
        
        
        frame.setTitle("操作界面");
        frame.setIconImage(icon1.getImage());
        frame.setSize(600,350);
        frame.setLocation(400, 300);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
public static void method_1(String s){//执行发送方法
	ProducerDemo a=new ProducerDemo();
	a.producer(s);
}
public static String method_2(){//执行接收方法	
	ComsumerDemo a=new ComsumerDemo();
	a.comsumer();
	String s=a._message;
	return s;
}
}

