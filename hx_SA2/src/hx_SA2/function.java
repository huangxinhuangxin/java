package hx_SA2;
import java.sql.*;
public class function {
	public int []zhu_num=new int [100];
	public String [] zhu_name=new String [100];
	public int []country_num=new int [100];
	public String [] country=new String [100];
	public int []product_price=new int [100];
	public String [] product_name=new String [100];
	public function() {}
	public String cfunction(String id,int type) 
	{
		String result=null;
		ResultSet rs=null;
		if(type==1)
		{
			String sql="select * from Customers where CustomerID='"+id+"'";
			sql s8=new sql();
			rs=s8.executeSelectQuery(sql);
			try
			{
				while(rs.next())
				{
					result="CompanyName:"+rs.getString("CompanyName")+"ContactName:"
							+rs.getString("ContactTitle");
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		if(type==2)
		{
			String sql="select * from Employees where EmployeeID="+id;
			sql s8=new sql();
			rs=s8.executeSelectQuery(sql);
			try
			{
				while(rs.next())
				{
					result="lastname:"+rs.getString("LastName");
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		return result;
	}
	public int picture_zhuzhuang()//对于画图表的数据分析准备
	{
		ResultSet rs=null;
		int num=0;
		String sql="select ProductName,UnitsInStock from Products";
		sql s8=new sql();
		rs=s8.executeSelectQuery(sql);
		try
		{
			while(rs.next())
			{
				zhu_name[num]=rs.getString("ProductName");
				zhu_num[num]=rs.getInt("UnitsInStock");
				num=num+1;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return num;
	}
	public int picture_shanxing()
	{
		int num=0;
		ResultSet rs=null;
		String sql="select Country,count(*) num_Country from Employees group by Country";
		sql s8=new sql();
		rs=s8.executeSelectQuery(sql);
		try
		{
			while(rs.next())
			{
				country[num]=rs.getString("Country");
				country_num[num]=rs.getInt("num_Country");
				num=num+1;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return num;
	}
	public int picture_zhexian()//对于画图表的数据分析准备
	{
		ResultSet rs=null;
		int num=0;
		String sql="select ProductName,UnitPrice from Products";
		sql s8=new sql();
		rs=s8.executeSelectQuery(sql);
		try
		{
			while(rs.next())
			{
				product_name[num]=rs.getString("ProductName");
				product_price[num]=rs.getInt("UnitPrice");
				num=num+1;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return num;
	}

}
