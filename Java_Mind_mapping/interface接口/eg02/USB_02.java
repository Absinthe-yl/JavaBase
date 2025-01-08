package Java_Mind_mapping.interface接口.eg02;

public interface USB_02 {//接口的修饰符只能是public和void
    //属性
    //接口的属性都是public static final
    public int n1=10;//等价public static final int n1=1;

    //方法(在接口中是抽象方法（可以省略abstract）)
    public void n2();//抽象方法没有方法体

    //但jdk8之后，可以用default关键字修饰，从而有方法体
    default public void n3(){
        System.out.println("default修饰的的n3方法");
    }

    //jdk8之后也可以有静态方法
    public static void n4(){
        System.out.println("static修饰的n4方法");
    }

}
