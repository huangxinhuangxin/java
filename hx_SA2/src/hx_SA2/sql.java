package hx_SA2;
import java.sql.*;
public class sql {
	private ResultSet rs=null;
    private Connection conn=null;
    String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	String dbURL="jdbc:sqlserver://47.106.141.93:1433;DatabaseName=Northwind";
	String userName="sa";
	String userPwd="Hx13026162630";
	
    public sql()
    {
    	try
		{
    		Class.forName(driverName);
    		conn=DriverManager.getConnection(dbURL,userName,userPwd);
    		System.out.println("�������ݿ�ɹ�");
    		rs=null;
		}
    	catch(Exception e)
		{
			e.printStackTrace();
			
			System.out.print("����ʧ��:"+e.getStackTrace().toString());
		}
    }


    private Connection openConnection()
    {
    	try
		{
    		if (conn.isClosed())
    		{
    			Class.forName(driverName);
        		conn=DriverManager.getConnection(dbURL,userName,userPwd);
        		System.out.println("�������ݿ�ɹ�");
        		rs=null;
    		}
		}
    	catch(Exception e)
		{
			e.printStackTrace();
			
			System.out.print("����ʧ��:"+e.getStackTrace().toString());
		}
        return conn;
    }
    

    public ResultSet executeSelectQuery(String _query)
    {
        try
        {
        	Statement statement=conn.createStatement();
        	rs=statement.executeQuery(_query);
        	System.out.print("��ѯ�ɹ�");
        	System.out.println(rs);
        }
        catch (Exception e)
        {
        	e.printStackTrace();
        
			System.out.print("��ѯʧ��:"+e.getStackTrace().toString());
            return null;
        }
        return rs;
    }
}
