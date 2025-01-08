package Java_Mind_mapping.多线程.继承Thread和实现Runnable接口的区别.实现Runnable接口.多个线程;
/*
运行的时候点击终端输入jconsole
 */
public class T01 {
    public static void main(String[] args) throws InterruptedException{
        T1 t1=new T1();
        T2 t2=new T2();
        Thread thread1=new Thread(t1);
        Thread thread2=new Thread(t2);//这里也可以写t1:多个线程共享一个资源
        thread1.start();
        thread2.start();
        for (int i=0;i<5;i++){
            System.out.println("主线程 i="+ i+"主线程名:"+Thread.currentThread().getName());
            Thread.sleep(1000);
        }
    }
}
class T1 implements Runnable{
    int count=0;

    @Override
    public void run() {
        while (true) {
            System.out.println("hello " + (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count == 5) {
                break;
            }
        }
    }
}
class T2 implements Runnable{
    int count=0;

    @Override
    public void run() {
        while (true) {
            System.out.println("world " + (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count == 5) {
                break;
            }
        }
    }
}