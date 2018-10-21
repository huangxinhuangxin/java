package hx_SA2;
import java.awt.Font;  
import java.text.DecimalFormat;  
import java.text.NumberFormat;  
  
import javax.swing.JPanel;  
  
import org.jfree.chart.ChartFactory;  
import org.jfree.chart.ChartPanel;  
import org.jfree.chart.JFreeChart;  
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;  
import org.jfree.chart.plot.PiePlot;  
import org.jfree.data.general.DefaultPieDataset;  
public class shanxingtu {
	public static String[] name;
	public static int [] num;
	static int number1;
	ChartPanel frame1; 
	public shanxingtu(String[] name1,int []num1,int number)
	{
		name=new String[number];
		num=new int[number];
		number1=number;
		for(int i=0;i<number;i++)
		{
			name[i]=name1[i];
			num[i]=num1[i];
		}
		DefaultPieDataset data = getDataSet();  
        JFreeChart chart = ChartFactory.createPieChart3D("Ա������",data,true,false,false);  
      //���ðٷֱ�  
        PiePlot pieplot = (PiePlot) chart.getPlot();  
        DecimalFormat df = new DecimalFormat("0.00%");//���һ��DecimalFormat������Ҫ������С������  
        NumberFormat nf = NumberFormat.getNumberInstance();//���һ��NumberFormat����  
        StandardPieSectionLabelGenerator sp1 = new StandardPieSectionLabelGenerator("{0}  {2}", nf, df);//���StandardPieSectionLabelGenerator����  
        pieplot.setLabelGenerator(sp1);//���ñ�ͼ��ʾ�ٷֱ�  
      
    //û�����ݵ�ʱ����ʾ������  
        pieplot.setNoDataMessage("��������ʾ");  
        pieplot.setCircular(false);  
        pieplot.setLabelGap(0.02D);  
      
        pieplot.setIgnoreNullValues(true);//���ò���ʾ��ֵ  
        pieplot.setIgnoreZeroValues(true);//���ò���ʾ��ֵ  
       frame1=new ChartPanel (chart,true);  
        chart.getTitle().setFont(new Font("����",Font.BOLD,20));//���ñ�������  
        PiePlot piePlot= (PiePlot) chart.getPlot();//��ȡͼ���������  
        piePlot.setLabelFont(new Font("����",Font.BOLD,10));//�������  
        chart.getLegend().setItemFont(new Font("����",Font.BOLD,10));  
	}
	private static DefaultPieDataset getDataSet() {  
        DefaultPieDataset dataset = new DefaultPieDataset();  
        for(int i=0;i<number1;i++)
        {
        	dataset.setValue(name[i], num[i]);
        }
        return dataset;  
}  
    public ChartPanel getChartPanel(){  
        return frame1;  
          
    }

}
