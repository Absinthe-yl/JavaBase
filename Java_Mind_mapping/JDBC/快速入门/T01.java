package Java_Mind_mapping.JDBC.快速入门;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class T01 {
    public static void main(String[] args)throws SQLException {
        //在项目下导入jar包到lib
        //=====(1)注册驱动=====
        Driver driver = new Driver(); //new com.mysql.jdbc.Driver().var
        //=====(2)得到连接=====
        String url="jdbc:mysql://localhost:3306/java_connect?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
        //统一字符集: ?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true
        /*
        jdbc:mysql:// 规定好表示协议，通过jdbc的方式连接mysql
        localhost 主机，也可以是ip地址
        3306 表示mysql的监听端口
        java_connect 具体的数据库
         */
        //将用户名和密码放入Properties对象
        Properties properties=new Properties();
        properties.setProperty("user","root");//用户   root、cjl可以更改，不同的用户名和密码登陆的不同数据库
        properties.setProperty("password","cjl");//密码
        Connection connect = driver.connect(url, properties); //connect:网络连接
        //=====(3)执行sql=====
        String sql="insert into actor values(null,'周梦','男','2004-1-1','123')";
        //String sql="update actor set name='姚旺' where id=1";
        //String sql="truncate table actor";
        Statement statement = connect.createStatement();
        int rows = statement.executeUpdate(sql); //如果是dml语句,返回的就是影响的行数
        System.out.println(rows > 0 ? "成功":"失败");
        //=====(4)关闭连接资源=====
        statement.close();
        connect.close();
    }
}
