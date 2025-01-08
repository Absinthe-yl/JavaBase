package Java_Mind_mapping.interface接口.eg01;

public class T01 {
    public static void main(String[] args){
        //创建对象
        camera cam01 = new camera();
        Phone pho01 = new Phone();
        computer com01 = new computer();
        com01.work(pho01);//手机接入计算机
        com01.work(cam01);
    }
}
