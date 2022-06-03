package com.software.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class DBUtils {
	private static String driverClass;
	private static String url;
	private static String username;
	private static String password;
	
	static{

		ResourceBundle rb = ResourceBundle.getBundle("com/software/utils/dbinfo");
		driverClass = rb.getString("driverClass");
		url = rb.getString("url");
		username = rb.getString("username");
		password = rb.getString("password");
		try {
			Class.forName(driverClass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 功能：获取数据库连接对象
	 * @return
	 * @throws Exception
	 */
	public static Connection getConnection() throws Exception{
		return DriverManager.getConnection(url, username, password);
	}

	/**
	 * 功能：执行单表的添加、修改、删除操作
	 * @param sql
	 * @return
	 */
	public static int executeSql(String sql){
		int result = 0;
		Connection connection = null;
		Statement st = null;
		try {
			connection = getConnection();
			st =connection.createStatement();
			result =st.executeUpdate(sql);

		} catch(Exception e){
			e.printStackTrace();
		} finally {
			closeAll(null,st,connection);
		}
		return result;
	}

	/**
	 * 功能：关闭数据库连接对象
	 * @param rs
	 * @param stmt
	 * @param conn
	 */
	public static void closeAll(ResultSet rs,Statement stmt,Connection conn){
		
		if(rs!=null){
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			rs = null;
		}
		if(stmt!=null){
			try {
				stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			stmt = null;
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			conn = null;
		}
	}
}
