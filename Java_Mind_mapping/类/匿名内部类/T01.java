package Java_Mind_mapping.类.匿名内部类;
/*
匿名内部类: 定义在外部类的局部位置(比如:方法中)且没有类名，只使用一次后续不再使用
(1)本质是类
(2)内部类
(3)没有名字
(4)同时还是一个对象
(5)基本语法:
new 类/接口 (参数列表){
    类体
}

(6)tiger2的编译类型是: A接口
(7)tiger2的运行类型是: 匿名内部类XXXX
    底层代码:
    class XXXX(Out01$1) implements A{
        @Override
        public void cry() {
            System.out.println("老虎叫。。。");
        }
    }
(8)jdk底层创建匿名内部类Out01$1，立马创建了Out01$1实例，并且把地址传给tiger2
*/
public class T01 { //外部其他类
    public static void main(String[] args) {
        Out01 o1=new Out01();
        o1.method();
    }
}
class Out01{//外部类
    private int n1=10;
    public void method(){
//        传统写法:
//        A tiger1=new Tiger();
//        tiger1.cry();
          A tiger2=new A(){
                @Override
                public void cry() {
                    System.out.println("老虎叫。。。");
                }
          };
          System.out.println("tiger02的运行类型:"+tiger2.getClass());
          tiger2.cry();
    }
}
interface A{ //接口
    public void cry();
}
class Tiger implements A{
    @Override
    public void cry() {
        System.out.println("老虎叫。。。");
    }
}
class Father{
    public Father(String name){
        super();
    }
    public void test(){

    }
}