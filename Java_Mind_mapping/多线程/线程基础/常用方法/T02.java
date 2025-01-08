package Java_Mind_mapping.多线程.线程基础.常用方法;
/*
(9)yield: 礼让。让出cpu，让其他线程先执行，但时间不确定，所以也不一定能礼让成功
(10)join: 插队。如果插队成功，则肯定执行完插入的线程所有任务
 */
public class T02 {
    public static void main(String[] args)throws InterruptedException {
        T2 t2=new T2();
        t2.start();
        for (int i=0;i<20;i++){
            Thread.sleep(1000);
            System.out.println("主线程吃了"+i+"包子");
            if(i==5){
                System.out.println("子线程先吃");
                t2.join();
                System.out.println("子线程吃完了");
            }
        }
    }
}
class T2 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<20;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("子线程吃了"+i+"包子");
        }
    }
}
