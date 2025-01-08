package Java_Mind_mapping.exception异常.五大异常.ClassCast类型转换异常;

public class T01 {
    public static void main(String[] args) {
        A n1= new B();//向上转型,运行类型是B
        B n2= (B) n1;//向下转型
        C n3= (C) n1;//A是B的父类，但是B和C没有关系
    }
}
class A{}
class B extends A{}
class C extends A{}