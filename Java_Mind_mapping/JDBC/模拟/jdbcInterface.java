package Java_Mind_mapping.JDBC.模拟;

public interface jdbcInterface {
    //连接
    public Object getConnection();
    //crud
    public void crud();
    //关闭连接
    public void close();
}
