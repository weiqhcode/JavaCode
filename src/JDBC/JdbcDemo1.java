/*@Time : 2020/9/20 13:31
 *@Author : 韦佗
 *@File : JdbcDemo1.java
 *@Software : IntelliJ IDEA
 */
package JDBC;


import java.sql.*;

//JDBC快速入门
public class JdbcDemo1 {

    public static void main(String[] args) throws Exception {

        //1.导入驱动jar包
        //2.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //3.获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3","root","123456");
        //4.定义sql语句
        String sql = "update account set balance = 500 where id = 1";
        //5.获取执行sql的对象,Statement
        Statement stmt = conn.createStatement();
        //6.执行sql
        int count = stmt.executeUpdate(sql);
        //7.处理结果
        System.out.println(count);
        //8.释放资源
        stmt.close();
        conn.close();
    }
}
