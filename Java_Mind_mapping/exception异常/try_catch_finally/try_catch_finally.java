package Java_Mind_mapping.exception异常.try_catch_finally;
/*
try{
    代码/可能有异常
}catch(Exception e){
    捕获到异常
    (1)系统将异常封装成Exception对象e,传递给catch
    (2)代码没有异常不会执行catch
}finally{
    (1)不管代码块是否异常，finally都要执行
    (2)资源释放代码放置处
    (3)无finally也可以通过
}
 */
public class try_catch_finally {
    public static void main(String[] args) {
        //快捷键:Ctrl+Alt+t
        try {
            String str="cjl";
            int a=Integer.parseInt(str); //Integer.parseInt(String s)字符串转化为整型，自动装箱为Integer,parseInt将字符串解析为十进制整数
            System.out.println("数字:"+a);
        } catch (NumberFormatException e) {
            System.out.println("异常信息:"+e.getMessage());
        } finally {
            System.out.println("finally代码块继续运行");
        }

        System.out.println("程序继续运行");
    }
}
