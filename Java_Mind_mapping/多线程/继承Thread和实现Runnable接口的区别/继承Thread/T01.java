package Java_Mind_mapping.多线程.继承Thread和实现Runnable接口的区别.继承Thread;
/*
(1)当我们继承Thread类，该类就可以当作线程使用
(2)重写run()方法，写上自己的业务逻辑
(3)run Thread类实现了Runnable接口的run()方法
(4)多线程并发: 进程先启动main线程，main线程再启动Thread-0子线程，但是这俩最终是交替执行的,后续main线程和Thread-0子线程都可以去启动其他子线程
 */
public class T01 {
    public static void main(String[] args) throws InterruptedException {
        //创建Cat对象，可以当作线程使用
        Cat cat1=new Cat();
        cat1.start();//启动线程
        //cat1.run();//run()方法只是一个普通的方法，并没有真正的去启动一个线程，就会把这个run方法执行完毕才会向下执行【串行化】
        for (int i=0;i<5;i++){
            System.out.println("主线程 i="+ i+"主线程名:"+Thread.currentThread().getName());
            Thread.sleep(1000);
        }
    }
}
class Cat extends Thread{
    int time=0;
    @Override
    public void run() { //重写run()方法，写上自己的业务逻辑
        while (true) {
            System.out.println("我爱code"+(++time)+"线程名:"+Thread.currentThread().getName());
            //ctrl+Alt+t
            try {
                Thread.sleep(1000); //1000ms=1s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(time==5){
                break;
            }
        }

    }
}