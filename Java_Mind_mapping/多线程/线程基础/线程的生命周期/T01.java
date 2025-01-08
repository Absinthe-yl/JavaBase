package Java_Mind_mapping.多线程.线程基础.线程的生命周期;

public class T01 {
    public static void main(String[] args) throws InterruptedException{
        T1 t=new T1();
        System.out.println(t.getName()+"状态"+t.getState());
        t.start();
        while (Thread.State.TERMINATED!=t.getState()){
            System.out.println(t.getName()+"状态"+t.getState());
            Thread.sleep(500);
        }
        System.out.println(t.getName()+"状态"+t.getState());
    }
}
class T1 extends Thread{
    @Override
    public void run() {
        while (true){
            for (int i=0;i<10;i++){
                System.out.println("hi "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            break;
        }
    }
}
