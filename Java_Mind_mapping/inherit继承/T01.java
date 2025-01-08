package Java_Mind_mapping.inherit继承;

import sun.management.Agent;

//ctrl+h查看继承关系

public class T01 {
    public static void main(String[] args) {
        Pet01dog p = new Pet01dog();
        p.name="小黑";
        //p.age=100;无法继承访问
        p.run(p.name);

        System.out.println("p1内容:");
        Pet01dog p1 = new Pet01dog("周梦");
        Pet01dog p2 = new Pet01dog("周梦",20);
    }
}

//定义一个父类
class Pet {
    //属性
    public String name;
    private int age;  //如果年龄是私有，子类不能访问
    //父类提供一个public的方法，返回
    public int getage() {
        return age=7;
    }

    //方法区
    public void run(String name){
        System.out.println(name+"running");
    }

    //无参构造
    public Pet(){
        System.out.println("父类无参构造器");
    }
    //有参构造
    public Pet(String name){
        System.out.println("父类有参构造器");
        System.out.println(name);
    }

}



//定义一个子类
class Pet01dog extends Pet{
    //可以什么都不写，反正有父类
    //无参构造
    public Pet01dog() {
        System.out.println("子类构造器被调用");
        System.out.println(getage());
    }

    //子类调用父类的无参构造器
    public Pet01dog(String name){
        //如果不写super()，默认调用super(),且super()只能放第一行，只能在构造器中使用，也不能与this.共存
        super();//父类无参构造器
        System.out.println("父类无参构造器被调用");
    }
    //子类调用父类的有参构造器
    public Pet01dog(String name, int age){
        //如果不写super()，默认调用super()
        super("cjl");//父类无参构造器
        System.out.println("父类有参构造器被调用");
    }
}

