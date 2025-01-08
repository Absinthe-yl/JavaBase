package Java_Mind_mapping.interface接口.eg02;


import Java_Mind_mapping.interface接口.eg01.USB_01;

public class T02 {
    public static void main(String[] args) {
        A a = new A();
        //(1) n1是静态属性
        System.out.println(USB_02.n1);
        //(2) n1不可以再赋值，是final属性
        //USB_02.n1=20;
        a.n2();
        a.n3();
        USB_02.n4();
    }
}
class A implements USB_02{
    //(1需要实现接口所有抽象方法
    @Override
    public void n2() {
        System.out.println("重写后的n2()");
    }

    @Override
    public void n3() {
        System.out.println("重写后的n3()");
    }
}

//(2)抽象类实现接口，可以不实现接口的所有抽象方法
//(3)一个类可以同时实现多个接口
abstract class abs implements USB_02, USB_01 {

}