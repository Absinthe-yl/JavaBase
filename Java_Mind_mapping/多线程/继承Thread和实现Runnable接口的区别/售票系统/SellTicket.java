package Java_Mind_mapping.多线程.继承Thread和实现Runnable接口的区别.售票系统;

public class SellTicket {
    public static void main(String[] args) {
        //=====以下是继承Thread方法======
//        st1 s1=new st1();
//        st1 s2=new st1();
//        st1 s3=new st1();
//        s1.start();
//        s2.start();
//        s3.start();
        //导致票数超卖
        //=====以下是实现Runnable接口方法=====
        st2 t1=new st2();//只创建一个对象就不需要使用static票数了
        new Thread(t1).start();
        new Thread(t1).start();
        new Thread(t1).start();
//        Thread t1=new Thread(t1);
//        Thread t2=new Thread(t1);
//        Thread t3=new Thread(t1);
//        t1.start();
//        t2.start();
//        t3.start();
    }
}
//继承Thread
class st1 extends Thread{
    private static int tixnum=100; //让多个线程共享tixnum
    @Override
    public void run() {
        while (true){
            if (tixnum<=0){ //当tixnum==1的时候，3个线程同时都不满足这个if导致超卖
                System.out.println("票已售完...");
                break;
            }
            //休眠50ms
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口"+Thread.currentThread().getName()+"售出1张票 "+"剩余票数="+(--tixnum));
        }
    }
}
//实现Runnable接口
class st2 implements Runnable{
    private int tixnum=100; //让多个线程共享tixnum
    @Override
    public void run() {
        while (true){
            if (tixnum<=0){
                System.out.println("票已售完...");
                break;
            }
            //休眠50ms
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口"+Thread.currentThread().getName()+"售出1张票 "+"剩余票数="+(--tixnum));
        }
    }
}
