package Java_Mind_mapping.类.局部内部类;

public class T01 {
    public static void main(String[] args) {
        T1 t=new T1();
        t.m1();
    }
}
class T1{
    private int n=10;
    private void m(){};
    public void m1(){
        final class t1{
            private int n=99;
            public void f1(){
            //局部内部类可以直接访问外部成员
            //如果外部类和局部类的成员重名，遵守就近原则，通过(外部类名.this.成员名)访问
            System.out.println("局部内部类 访问n="+n);
            System.out.println("局部内部类 访问n="+T1.this.n);
            m();
            //如果外部类和局部类的成员重名，遵守就近原则，通过(外部类名.this.成员名)访问

            }
        }
        //外部类在方法中可以直接创建调用
        t1 mm=new t1();
        mm.f1();
    }
}
