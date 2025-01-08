package Java_Mind_mapping.JDBC.模拟;

public class T01 {
    public static void main(String[] args) {
        //完成对mysql的操作
        jdbcInterface jdbc1=new jdbcImplement_mysql();
        jdbc1.getConnection();//通过接口来调用实现类[动态绑定]
        jdbc1.crud();
        jdbc1.close();
        System.out.println("============");
        jdbcInterface jdbc2=new jdbcImplement_oracle();
        jdbc2.getConnection();//通过接口来调用实现类[动态绑定]
        jdbc2.crud();
        jdbc2.close();
    }
}
