package uuu.mysql_test.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 	預防SqlInjection的 JDBC使用 的正確做法
 * 	以登入功能為例:
 * 		帳號: sqlInject_id
 * 		密碼: sqlInject_password
 */
public class PreventSqlInjectionTesting {
	private static final String driver = System.getProperty("driver", "com.mysql.cj.jdbc.Driver");
	private static final String url = System.getProperty("url", "jdbc:mysql://localhost:3306/db");
	private static final String userid = System.getProperty("userid", "root");
	private static final String pwd = System.getProperty("pwd", "EighthGate9527"); 
	
	public static void main(String[] args) {
		String SELECT_CUSTOMER = "SELECT id, password, name, gender, email, birthday, "
				+ "address, phone, subscribed, discount FROM customers "
				+ "WHERE id =? OR email=?";
		
		String sqlInject_id = "A123456789";
		String sqlInject_password = "aaaa1111";	
		
		//1. 載入 JDBC Driver
		try {
			Class.forName(driver);	//--equal_to--> com.mysql.cj.jdbc.Driver driver1 = new Driver();
			
			
			//2. 建立連線
			//把要關閉的物件放到 try()中，最後會自動添加finally，把物件關掉
			try (	
					Connection con = DriverManager.getConnection(url, userid, pwd); //2.建立連線
					PreparedStatement pstmt = con.prepareStatement(SELECT_CUSTOMER); //3.1建立指令(Statement)
				){
					//3.2建立資料
						//一個問號就是一個值
						//pstmt.setString 不是要關掉的物件，所以無法放在try(...)中
					pstmt.setString(1, sqlInject_id);
					pstmt.setString(2, sqlInject_password);
					
					//ResultSet要做try,catch，預防資料庫鎖定問題
					try (
							//4.執行指令
							ResultSet rs = pstmt.executeQuery();
						) {
						//5.處理指令
						while ( rs.next() ) {
							System.out.println("in_loop");
							System.out.println("id: " + rs.getString("id"));
							System.out.println("密碼: " + rs.getString("password"));
							System.out.println("姓名: " + rs.getString("name"));
							System.out.println("性別: " + rs.getString("gender"));
							System.out.println("email: " + rs.getString("email"));
							System.out.println("生日: " + rs.getString("birthday"));
							System.out.println("地址: " + rs.getString("address"));
							System.out.println("電話: " + rs.getString("phone"));
							System.out.println("是否訂閱電子報: " + rs.getBoolean("subscribed"));
							System.out.println("\n**********************************************\n");
						
						}
					}
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
