package com.yw.common.utils.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionUtil {
    //定义获取Connection对象的方法
    public static Connection getConnection(String url, String userName, String password, String driver) throws Exception {
        //定义Connection对象
        Connection conn = null;
        if (conn == null) {
            Class.forName(driver);//将"com.mysql.jdbc.Driver"类的Class类对象加载到运行时内存中
            conn = DriverManager.getConnection(url, userName, password);
        }
        return conn;
    }

    public static void close(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}