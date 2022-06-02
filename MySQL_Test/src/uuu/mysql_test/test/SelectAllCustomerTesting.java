package uuu.mysql_test.test;

import java.sql.*;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SelectAllCustomerTesting {
	private static final String driver = System.getProperty("driver", "com.mysql.cj.jdbc.Driver");
	private static final String url = System.getProperty("url", "jdbc:mysql://localhost:3306/db");
	private static final String userid = System.getProperty("userid", "root");
	private static final String pwd = System.getProperty("pwd", "EighthGate9527");
	
	private static String SELECT_ALL_CUSTOMER = "SELECT id, password, name, gender, email, birthday, "
											+ "address, phone, subscribed, discount FROM customers ";
	
	public static void main(String[] args) {
		//1.載入Driver
		try {
			Class.forName(driver);
		
			//把要關閉的物件放到 try() 中
			try (	
					Connection con = DriverManager.getConnection(url, userid, pwd); //2.建立連線
					Statement stmt = con.createStatement();							//3.建立指令(Statement)
					ResultSet rs = stmt.executeQuery( SELECT_ALL_CUSTOMER );		//4.執行指令
				){
				
				//5.處理指令
				while ( rs.next() ) {
					System.out.println("id: " + rs.getString("id"));
					System.out.println("密碼: " + rs.getString("password"));
					System.out.println("姓名: " + rs.getString("name"));
					System.out.println("性別: " + rs.getString("gender"));
					System.out.println("email: " + rs.getString("email"));
					System.out.println("生日: " + rs.getString("birthday"));
					System.out.println("地址: " + rs.getString("address"));
					System.out.println("電話: " + rs.getString("id"));
					System.out.println("是否訂閱電子報: " + rs.getBoolean("subscribed"));
					
					System.out.println("\n**********************************************\n");
				}
				

			} catch (SQLException e) {
				Logger.getLogger("CheckedException").log(Level.SEVERE, "資料庫連線失敗", e);
			}
		} catch (ClassNotFoundException e) {
			Logger.getLogger("CheckedException").log(Level.SEVERE, "資料庫連線失敗", e);
		}
	}
}
