package hx_SA2;
import java.awt.GridLayout;
import javax.swing.JFrame;
public class zhuzhuang_tran {
	public zhuzhuang_tran(String[] name1,int []num1,int number)
	{
		JFrame frame=new JFrame("Java����ͳ��ͼ");  
		//frame.setLayout(new GridLayout(2,2,10,10));  
	    frame.add(new zhuzhuangtu(name1,num1,number).getChartPanel());
	    frame.setBounds(50, 50, 900, 900);  
	    frame.setVisible(true);  
	}

}
