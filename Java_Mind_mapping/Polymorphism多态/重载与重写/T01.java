package Java_Mind_mapping.Polymorphism多态.重载与重写;

public class T01 {
    public static void main(String[] args){
        //方法重载实现多态(不同参数个数调用不同方法，体现多态)
        B a = new B();
        System.out.println(a.sum(10,20));
        System.out.println(a.sum(10,20,30));

        //方法重写实现多态(不同类中调用名字相同的方法，体现多态)
        A b = new A();
        b.say();
        a.say();
    }
}
//父类
class A{
    public void say(){
        System.out.println("父类A say()方法被调用");
    }
}
//子类
class B extends A{
    public int sum(int n1, int n2){
        return n1 + n2;
    }
    public int sum(int n1, int n2, int n3){
        return n1+n2+n3;
    }

    public void say(){
        System.out.println("子类B say()方法被调用");
    }
}