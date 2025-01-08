package Java_Mind_mapping.JDBC.快速入门;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class T01_2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java_connect?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
        String user = "root";
        String password = "cjl";

        try (Connection connect = DriverManager.getConnection(url, user, password);
             Statement statement = connect.createStatement()) {

            String sql = "INSERT INTO actor VALUES (NULL, '周梦', '男', '2004-1-1', '123')";
            int rows = statement.executeUpdate(sql);
            System.out.println(rows > 0 ? "成功" : "失败");

        } catch (SQLException e) {
            e.printStackTrace(); // 或者其他错误处理逻辑
        }
    }
}



/*
public class T01_2 {
    public static void main(String[] args)throws SQLException {
        String url = "jdbc:mysql://localhost:3306/java_connect?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
        String user = "root";
        String password = "cjl";

        Connection connect = DriverManager.getConnection(url, user, password);
        Statement statement = connect.createStatement();
        String sql = "INSERT INTO actor VALUES (NULL, '周梦', '男', '2004-1-1', '123')";
        int rows = statement.executeUpdate(sql);
        System.out.println(rows > 0 ? "成功" : "失败");
    }
}
 */
