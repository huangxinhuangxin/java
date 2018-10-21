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
        JFreeChart chart = ChartFactory.createLineChart("产品价格信息", "产品编号", "价格",linedataset,PlotOrientation.VERTICAL,true, true, true);  
        CategoryPlot plot = chart.getCategoryPlot();
        CategoryAxis dateaxis=plot.getDomainAxis(); 
        
        frame1=new ChartPanel(chart,true);  
        dateaxis.setLabelFont(new Font("黑体",Font.BOLD,14));         //水平底部标题  
        dateaxis.setTickLabelFont(new Font("宋体",Font.BOLD,6));  //垂直标题  
        ValueAxis rangeAxis=plot.getRangeAxis();//获取柱状  
        rangeAxis.setLabelFont(new Font("黑体",Font.BOLD,15));  
        chart.getLegend().setItemFont(new Font("黑体", Font.BOLD, 15));  
        chart.getTitle().setFont(new Font("宋体",Font.BOLD,20));//设置标题字体

	}
	private static DefaultCategoryDataset createDataset()
    {  //这个数据集有点多，但都不难理解  
   	 DefaultCategoryDataset linedataset = new DefaultCategoryDataset();
        int i=0;
		while(i<number1)
		{
			linedataset.addValue(num[i], "产品价格信息",name[i]);
			i++;
		} 
		  return linedataset; 
       }
	public ChartPanel getChartPanel(){  
		 return frame1;  
		   
		}

}
