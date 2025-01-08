package Java_Mind_mapping.多线程.继承Thread和实现Runnable接口的区别.实现Runnable接口.单个线程;

/*
继承Thread和Runnable本质没有区别，但是实现Runnable接口更适合多个线程共享一个资源的情况，避免了单线程的限制
 */
public class T01 {
    public static void main(String[] args) {
        dog d1=new dog();
        //dog.start() 无法被调用，Runnable没有这个方法
        Thread thread=new Thread(d1);//Runnable与Thread的主要区别步骤
        thread.start();//代理模式
    }
}
class dog implements Runnable{ //通过实现Runnable接口开发线程
    int count=0;

    @Override
    public void run() { //普通方法
        while (true){
            System.out.println("小狗汪汪叫.."+(++count)+Thread.currentThread().getName());
            //休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(count==5){
                break;
            }
        }
    }
}