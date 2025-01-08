package Java_Mind_mapping.多线程.锁.死锁;
/*
死锁:多个线程占用对方锁资源，但不互相让导致死锁
 */
public class T01 {
    public static void main(String[] args) {
        deadlockdemo d1=new deadlockdemo(true);
        deadlockdemo d2=new deadlockdemo(false);
        d1.start();
        d2.start();
    }
}
class deadlockdemo extends Thread{
    static Object o1=new Object();//保证多个线程共享一个对象，这里使用static
    static Object o2=new Object();
    boolean flag;

    public deadlockdemo(boolean flag){
        this.flag=flag;
    }

    @Override
    public void run() {
        if(flag){
            //对象互斥锁，下面就是同步代码(加了互斥锁才形成同步代码)
            synchronized (o1){ //(1)如果flag=true，先持有o1对象锁
                System.out.println(Thread.currentThread().getName()+"进入1");
                synchronized (o2){ //(2)继续尝试获取o2对象锁  1.如果得不到o2对象锁，就会Blocked
                    System.out.println(Thread.currentThread().getName()+"进入2");
                }
            }
        }else {
            synchronized (o2){//(1)如果flag=false，先持有o2对象锁
                System.out.println(Thread.currentThread().getName()+"进入3");
                synchronized (o1){ //(2)继续尝试获取o1对象锁  1.如果得不到o1对象锁，就会Blocked
                    System.out.println(Thread.currentThread().getName()+"进入4");
                }
            }
        }
    }
}