package com.software.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*JDBC使用
* 1.添加jdbc jar 包
* 2.创建数据库的连接对象*/
public class DBHelper {
    public static void main(String[] args) {
        //1.创建连接对象
        //1.1加载MYSQL驱动
        String url="jdbc:mysql://localhost:3306/nursecenter?useUnicode=true&characterEncoding=utf8";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //1.2 创建数据库连接对象
            Connection connection = DriverManager.getConnection(url, "root", "123456");
            System.out.println(connection);
            //1.3 创建Statement对象
            Statement st = connection.createStatement();
            //1.4定义SQL语句
            String sql ="INSERT  INTO `doctor_chart`(`principal`,`doctor_num`,`name`,`age`,`work_year`,`Account`,`password`,`gender`,`birthday`,`Title`,`department`,`Delmark`,`remarks`) VALUES (8,511,'刘衡',58,'30','heng','900546','男','1964/9/10','护士','外科','1',NULL);";
            int count = st.executeUpdate(sql);
            if(count>0){
                System.out.println("success!");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}
