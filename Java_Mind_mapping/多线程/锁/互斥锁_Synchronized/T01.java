package Java_Mind_mapping.多线程.锁.互斥锁_Synchronized;
/*
(1)同步方法的局限性:导致程序执行效率降低
(2)同步方法(非静态)的锁默认是是this,也可以是其他对象
(3)同步方法(静态)的锁为类本身，默认对象:当前类.class


线程同步机制:
多线程编程中，一些敏感数据不允许被多个线程同时访问，此时就使用同步服务机制，保证无论什么时候都只能最多一个线程访问，保证数据完整性
(用的时候上锁，用完解锁)
(1)同步代码块
synchronized(对象){
    //需要被同步的代码
}
(2)可以放在方法声明中，表示该方法为同步方法
public synchronized void m (String name){
    //需要被同步的代码
}
 */
public class T01 {
    public static void main(String[] args) {
        st3 t1=new st3();
        //创建3个线程调用同一个资源
        new Thread(t1).start();
        new Thread(t1).start();
        new Thread(t1).start();
    }
}
//使用同步方法Synchronized
class st3 implements Runnable{
    private int tixnum=100;
    Object obj1=new Object();
    private boolean loop=true;
    public /*synchronized*/ void sell(){ //同一个时刻只有一个线程来实现m方法
        synchronized(/*this*/ obj1 ) {  //obj1是类的一个成员，所以是被共享的
            if (tixnum <= 0) {
                loop = false;
                System.out.println("票已售完...");
                return;
            }
            //休眠50ms
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口" + Thread.currentThread().getName() + "售出1张票 " + "剩余票数=" + (--tixnum));
        }
    }

    @Override
    public void run() {
        while (loop){
            sell();
        }
    }

    //同步方法(静态)的锁为类本身
    //锁是加在类(st3)上的
    public synchronized static void m1(){

    }
    public static void m2(){
        synchronized (st3.class/*this*/){
            System.out.println("m2");
        }
    }
    //这里为什么不能用this,是因为主函数创建了很多对象，创建3个对象就会创建3个this锁，造成多把锁的后果
    //new Thread(t1).start();
    //new Thread(t1).start();
    //new Thread(t1).start();
    public void m3(){
        synchronized (st3.class/*this*/){
            System.out.println("m2");
        }
    }

}
