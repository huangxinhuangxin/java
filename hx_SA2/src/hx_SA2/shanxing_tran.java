package hx_SA2;
import javax.swing.JFrame;
public class shanxing_tran {
	public shanxing_tran(String[] name1,int []num1,int number)
	{
		JFrame frame=new JFrame("Java数据统计图");  
		//frame.setLayout(new GridLayout(2,2,10,10));  
	    frame.add(new shanxingtu(name1,num1,number).getChartPanel());
	    frame.setBounds(50, 50, 900, 450);  
	    frame.setVisible(true);  
	}

}
