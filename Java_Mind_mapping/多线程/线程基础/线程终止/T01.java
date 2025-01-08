package Java_Mind_mapping.多线程.线程基础.线程终止;
/*
(1)当线程完成任务后,自动退出
(2)通过使用变量控制run()退出
 */
public class T01 {
    public static void main(String[] args) throws InterruptedException{
        T1 t1=new T1();
        t1.start();
        //希望main主线程去控制T1线程的终止，修改loop变量
        //先让主线程休眠10s再通知t1线程终止
        Thread.sleep(10*1000);
        t1.setLoop(false);
    }
}
class T1 extends Thread{
    int count=0;
    private boolean loop=true;//设置一个控制变量
    @Override
    public void run() {
        while (loop){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("线程t运行中..."+(++count));
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}