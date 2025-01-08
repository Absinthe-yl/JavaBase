package Java_Mind_mapping.interface接口.接口测试题;

import schoolwork.experiment03.USB_T04;

/*
4、我们笔记本电脑上都有USB接口,当我们的鼠标和键盘插上去之后才可以使用,拔出来就关闭使用.
其实具体是什么USB设备，笔记本并不关心，只要符合USB规格的设备都可以。鼠标和键盘要想能在电脑上使用，
那么鼠标和键盘也必须遵守USB规范，不然鼠标和键盘的生产出来无法使用;根据描述设计程序,完成键盘和鼠标插在电脑上就开启,拔出来就关闭的需求.要求：
1）定义USB接口,定义两个抽象方法开启(open)和关闭(close)方法
2）定义笔记本类,定义一个开机(start)方法,定义一个关机(stop),定义一个使用USB方法(useUSB(USB usb))
3）定义鼠标类，实现USB接口，在开启和关闭方法中输出相关信息（鼠标开启；鼠标关闭）
4）定义测试类
   （1）创建笔记本对象,调用开机功能
 （2）调用笔记本的使用USB方法(useUSB(USB usb)),传递鼠标对象。

 */
public class T04 {
    public static void main(String[] args) {
        notebook n1=new notebook();
        n1.start();
        mouse m1=new mouse();
        n1.useUSB(m1);
    }
}


class notebook{
    public void start(){
        System.out.println("开机");
    }
    public void stop(){
        System.out.println("关机");
    }
    //调用接口
    public void useUSB(USB_T04 usb){
        usb.open();
        usb.close();
    }

}
class mouse implements USB_T04{
    //实现接口
    @Override
    public void open() {
        System.out.println("鼠标开启");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭");
    }
}