package hx_SA2;
import java.awt.Font;
import org.jfree.chart.ChartFactory;  
import org.jfree.chart.ChartPanel;  
import org.jfree.chart.JFreeChart;  
import org.jfree.chart.axis.CategoryAxis;  
import org.jfree.chart.axis.ValueAxis;  
import org.jfree.chart.plot.CategoryPlot;  
import org.jfree.chart.plot.PlotOrientation;  
import org.jfree.data.category.CategoryDataset;  
import org.jfree.data.category.DefaultCategoryDataset;
public class zhexiantu {
	ChartPanel frame1;
	public static String[] name;
	public static int [] num;
	static int number1;
	public zhexiantu(String[] name1,int []num1,int number)
	{
		name=new String[number];
		num=new int[number];
		number1=number;
		for(int i=0;i<number;i++)
		{
			name[i]=name1[i];
			num[i]=num1[i];
		}
		DefaultCategoryDataset linedataset = createDataset();  
        JFreeChart chart = ChartFactory.createLineChart("��Ʒ�۸���Ϣ", "��Ʒ���", "�۸�",linedataset,PlotOrientation.VERTICAL,true, true, true);  
        CategoryPlot plot = chart.getCategoryPlot();
        CategoryAxis dateaxis=plot.getDomainAxis(); 
        
        frame1=new ChartPanel(chart,true);  
        dateaxis.setLabelFont(new Font("����",Font.BOLD,14));         //ˮƽ�ײ�����  
        dateaxis.setTickLabelFont(new Font("����",Font.BOLD,6));  //��ֱ����  
        ValueAxis rangeAxis=plot.getRangeAxis();//��ȡ��״  
        rangeAxis.setLabelFont(new Font("����",Font.BOLD,15));  
        chart.getLegend().setItemFont(new Font("����", Font.BOLD, 15));  
        chart.getTitle().setFont(new Font("����",Font.BOLD,20));//���ñ�������

	}
	private static DefaultCategoryDataset createDataset()
    {  //������ݼ��е�࣬�����������  
   	 DefaultCategoryDataset linedataset = new DefaultCategoryDataset();
        int i=0;
		while(i<number1)
		{
			linedataset.addValue(num[i], "��Ʒ�۸���Ϣ",name[i]);
			i++;
		} 
		  return linedataset; 
       }
	public ChartPanel getChartPanel(){  
		 return frame1;  
		   
		}

}
