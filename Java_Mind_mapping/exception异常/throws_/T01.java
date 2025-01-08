package Java_Mind_mapping.exception异常.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class T01 {
    public static void main(String[] args) throws Exception { //(1)程序没有写throw,默认扔给父类，直到JVM

    }

    public static void f1(){
        /*
        (1) 调用f2()会报错
        (2) f2()抛出编译异常，f1()调用必须处理
            方法1: 继续抛出异常，改成public static void f1() throws FileNotFoundException {}
            方法2:try-catch-finally
         */
        try {
            f2();// f2()抛出异常
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        f3();//不会报错，因为f3()是RuntimeExceptions及其子类通常被称运行时异常，有默认处理机制
    }

    public static void f2() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("d:\\aa.txt");
    }
    public static void f3() throws ArithmeticException {
    }
}



//(2)子类重写父类的方法时，对抛出异常的规定:子类重写父类的方法
//   所抛出的异常类型-->与父类抛出的一致/子类型
class Father {
    public void method() throws RuntimeException {}
}
class Son extends Father {
    @Override
    public void method() throws NullPointerException {
        super.method();
    }
}

