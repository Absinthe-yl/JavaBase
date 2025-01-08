package Java_Mind_mapping.多线程.线程基础.常用方法;
/*
(1)setName: 设置线程名称
(2)getName: 返回线程名称
(3)start: 执行线程;java虚拟机底层调用该线程的start0()方法
(4)run: 调用线程run()方法
(5)setPriority: 更改线程优先级
(6)getPriority: 获取线程优先级
(7)sleep: 休眠指定ms数
(8)interrupt: 中断线程
 */
public class T01 {
    public static void main(String[] args) throws InterruptedException{
        T t1 = new T();
        t1.setName("cjl");//设置线程名称
        t1.setPriority(Thread.NORM_PRIORITY);//设置线程优先级
        t1.start();

        //主线程打印5个hi，然后中断子线程的休眠
        for (int i = 0; i <= 5; i++) {
            Thread.sleep(1000);
            System.out.println("hi" + i);
        }
        t1.interrupt();//执行到这里就会中断休眠
    }
}

class T extends Thread {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i <= 100; i++) {
                System.out.println(Thread.currentThread().getName() + "吃包子..." + i);
            }
            try {
                System.out.println(Thread.currentThread().getName() + "休眠中。。。");
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                //InterruptException是捕获到一个中断异常
                //当线程执行到interrupt方法时，就会catch一个异常，可以加入自己的业务代码
                System.out.println(Thread.currentThread().getName() + "被interrupt了");
            }
        }
    }
}