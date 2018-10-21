package hx_SA2;
import javax.swing.JFrame;
public class zhexian_tran {
	public zhexian_tran(String[] name1,int []num1,int number) 
	{
		JFrame frame=new JFrame("Java数据统计图");  
		//frame.setLayout(new GridLayout(2,2,10,10));  
	    frame.add(new zhexiantu(name1,num1,number).getChartPanel());
	    frame.setBounds(50, 50, 1000, 800);  
	    frame.setVisible(true);  
	}

}
