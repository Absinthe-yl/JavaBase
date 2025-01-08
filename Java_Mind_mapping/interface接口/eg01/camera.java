package Java_Mind_mapping.interface接口.eg01;

public class camera implements USB_01 {
    @Override
    public void start() {
        System.out.println("相机开始工作");
    }
    @Override
    public void stop() {
        System.out.println("相机停止工作");
    }
}
