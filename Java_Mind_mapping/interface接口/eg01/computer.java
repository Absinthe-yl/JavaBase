package Java_Mind_mapping.interface接口.eg01;

public class computer {
    //编写一个计算机工作的方法
    public void work(USB_01 usb01){
        //通过接口调用方法
        usb01.start();
        usb01.stop();
    }
}
