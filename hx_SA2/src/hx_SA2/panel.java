package hx_SA2;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;
public class panel extends JPanel{
	private JLabel label_cin,label_set;            //标签      输入信息
	private JTextField receive_mention,set_mention;//文本框  消息发送
	private JPanel panel_cin,panel_set,panel_button,panel_radio;
	private JButton button1,button2,button3,button4;//按钮      接收消息，展示结果
	private JRadioButton customer,employee;
	private int type=0;
	private ButtonGroup group;
	public panel()
	{
		this.label_cin=new JLabel("输入客户id或员工id");
		this.label_set=new JLabel("信息");
		this.receive_mention=new JTextField(10);
		this.set_mention=new JTextField(10);
		this.panel_cin=new JPanel();
		this.panel_set=new JPanel();
		this.panel_button=new JPanel();
		this.panel_radio=new JPanel();
		//this.button_receive=new JButton("确认接收消息");
		this.button1=new JButton("柱状图");
		this.button2=new JButton("扇形图");
		this.button3=new JButton("折线图");
		this.button4=new JButton("信息查询");
		this.customer=new JRadioButton("客户id");
		this.employee=new JRadioButton("员工id");
		this.group=new ButtonGroup();
		//this.setLayout(new GridLayout(3, 1));  //网格式布局
		this.panel_radio.add(customer);
		this.panel_radio.add(employee);
		this.panel_cin.add(label_cin);
		this.panel_cin.add(receive_mention);
		this.panel_set.add(label_set);
		this.panel_set.add(set_mention);
		this.panel_button.add(button4);
		this.group.add(customer);
		this.group.add(employee);
		customer.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent event)
			{
				type=1;
			}
				}
		);
		employee.addActionListener(new ActionListener()
		{
	public void actionPerformed(ActionEvent event)
	{
		type=2;
	}
		}
);
		//this.panel_button.add(button_receive);
		this.panel_button.add(button1);
		this.panel_button.add(button2);
		this.panel_button.add(button3);
		
		this.add(panel_cin);
		this.add(panel_set);
		this.add(panel_radio);
		this.add(panel_button);
		sa_action c_action=new sa_action();
		button1.addActionListener(c_action);
		button2.addActionListener(c_action);
		button3.addActionListener(c_action);
		button4.addActionListener(c_action);
	}
	private class sa_action implements ActionListener
	{
		public sa_action() {}
		 public void actionPerformed(ActionEvent event)
		 {
			 if(event.getActionCommand().equals("柱状图"))
			 {
				 //String cid=receive_mention.getText();
				 function f1=new function();
				 //set_mention.setText(f1.cfunction(cid,type));
				 int number=f1.picture_zhuzhuang();
				 System.out.print(number);
				 zhuzhuang_tran zhu_picture=new zhuzhuang_tran(f1.zhu_name,f1.zhu_num,number);				 
			}
			 else if(event.getActionCommand().equals("扇形图"))
			 {
				 function f1=new function();
				 int number1=f1.picture_shanxing();
				 System.out.print(number1);
				 shanxing_tran piece_picture=new shanxing_tran(f1.country,f1.country_num,number1);
			 }
			 else if(event.getActionCommand().equals("折线图"))
			 {
				 function f1=new function();
				 int number2=f1.picture_zhexian();
				 System.out.print(number2);
				 zhexian_tran series_picture=new zhexian_tran(f1.product_name,f1.product_price,number2);
			 }
			 else if(event.getActionCommand().equals("信息查询"))
			 {
				 String cid=receive_mention.getText();
				 function f1=new function();
				 set_mention.setText(f1.cfunction(cid,type));
			 
			 }
			 
		 }
			 
			 
		 }
	}



