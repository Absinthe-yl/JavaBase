package Java_Mind_mapping.exception异常.throw自定义异常;
/*
(1) 自定义异常类名继承Exception/RuntimeException
(2) 继承Exception-->编译异常
(3) 继承RuntimeException-->运行异常(一般继承这个)
 */
public class T01 {
    public static void main(String[] args) {
        int age=-80;
        if(!(age>18 && age<120)){
            //通过构造器设置信息
            System.out.println("打印:年龄需要在18-120之间");
            throw new AgeException("抛出:年龄需要在18-120之间");//程序终止
        }
        System.out.println("你的年龄范围正确:"+age);//通过异常机制，这句话在异常时不会输出
    }
}
//自定义异常
class AgeException extends RuntimeException { //是RuntimeExceptions及其子类通常被称运行时异常，有默认处理机制
    //构造器
    public AgeException(String message) {
        super(message);//选择父类含参构造器
    }
}
