package uuu.mysql_test.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mysql.cj.jdbc.Driver;

public class MySQLTesting {
	public static void main(String[] args) {
		// load properties => 先不教
		
							  //Run as > Run Configurations > Arguments > VM arguments > "-Ddrivcer=xxxxxxx"
		final String driver = System.getProperty("driver", "com.mysql.cj.jdbc.Driver");
		final String urlString = "jdbc:mysql://localhost:3306/db";
		final String userid = "root";
		final String pwd = "EighthGate9527";
		
		//1. 載入 JDBC Driver
		try {
			Class.forName(driver);	//--equal_to--> com.mysql.cj.jdbc.Driver driver1 = new Driver();
			
			
			//2. 建立連線
			try {
				Connection con = DriverManager.getConnection(urlString, userid, pwd);
				System.out.println("連線成功: " + con.getCatalog());
				
				con.close();	
			} 
			catch (SQLException e) {
				Logger.getLogger("JDBC_DRIVER_LOG").log(Level.SEVERE, "資料庫連線失敗",e);
			}
			
			
		} 
		catch (ClassNotFoundException e) {
			Logger.getLogger("JDBC_DRIVER_LOG").log(Level.SEVERE, "載入JDBC_DRIVER失敗",e);
		}
		
	}
}
