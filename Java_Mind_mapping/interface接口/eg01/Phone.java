package Java_Mind_mapping.interface接口.eg01;

//Phone类实现USB_01接口
//(1)Phone类需要实现USB_01接口 规定/声明 的方法
public class Phone implements USB_01 {
    @Override
    public void start() {
        System.out.println("手机开始工作");
    }
    @Override
    public void stop() {
        System.out.println("手机停止工作");
    }
}
