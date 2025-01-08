package Java_Mind_mapping.多线程.线程基础.常用方法.用户线程和守护线程;
/*
用户线程(工作线程): 当线程的任务执行完毕或通知结束
Daemon守护线程: 一般为工作线程服务，当所有用户线程结束，守护线程自动结束(常见的守护线程:垃圾回收机制)
 */
public class T01 {
    public static void main(String[] args) throws InterruptedException {
        T1 t1=new T1();
        //将子线程设置为守护线程，同步结束
        t1.setDaemon(true);
        t1.start();
        for (int i=0;i<5;i++){
            System.out.println("？？？？");
            Thread.sleep(1000);
        }
    }
}
class T1 extends Thread{
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(".......");
        }
    }
}