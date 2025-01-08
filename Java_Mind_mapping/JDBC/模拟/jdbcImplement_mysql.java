package Java_Mind_mapping.JDBC.模拟;

public class jdbcImplement_mysql implements jdbcInterface {

    @Override
    public Object getConnection() {
        System.out.println("得到mysql的连接");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("完成mysql的连接");
    }

    @Override
    public void close() {
        System.out.println("关闭mysql的连接");
    }
}
