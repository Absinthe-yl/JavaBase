package Java_Mind_mapping.exception异常.try_catch_finally;

public class try_finally {
    public static void main(String[] args) {
        try {
            int n1=10;
            int n2=0;
            System.out.println(n1/n2); //ArithmeticException数组运算异常
        } finally {
            System.out.println("执行了finally"); //打印后直接exit退出程序
        }
        System.out.println("程序继续运行"); //不会打印处理，异常没有catch，程序崩掉
    }
}
