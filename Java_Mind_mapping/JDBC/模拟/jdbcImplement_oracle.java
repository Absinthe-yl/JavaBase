package Java_Mind_mapping.JDBC.模拟;

public class jdbcImplement_oracle implements jdbcInterface{
    @Override
    public Object getConnection() {
        System.out.println("得到oracle的连接");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("完成oracle的连接");
    }

    @Override
    public void close() {
        System.out.println("关闭oracle的连接");
    }
}
