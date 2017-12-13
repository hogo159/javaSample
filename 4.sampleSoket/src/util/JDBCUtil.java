package util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtil {
	
	public static Connection getconnection(){
		Connection con = null;
		String driver = null;
		String url = null;
		String user = null;
		String pw = null;
		String fileName ="c:/file/dbinfo.txt";
		
		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream(fileName));
			Class.forName(prop.getProperty("driver"));
			con = DriverManager.getConnection(prop.getProperty("url"),
					prop.getProperty("user"),
					prop.getProperty("pw"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	catch (Exception e) {
			System.out.println(e.getMessage());
		}	
		
		return con;
		
	}
	
		public static void close(ResultSet rs ,Statement st, Connection con){
			
			
			try {
				if(rs != null){
					rs.close();
					rs = null;
				}
				if(st != null){
					st.close();
					st = null;
				}
				if(con != null){
					con.close();
					con =null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	
	
}
