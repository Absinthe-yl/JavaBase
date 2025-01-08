package Java_Mind_mapping.encapsulation封装.封装与构造器.Constructor构造器;

public class T01{
    public static void main(String[] args) {
        //创建小猫
        Catcat cat1 = new Catcat();
        Catcat cat2 = new Catcat("小花");
        Catcat cat3= new Catcat("小黑",80);
        //无参猫
        cat1.name="小白";
        cat1.age=3;

        cat1.show();//打印第1只猫
        cat2.show();//打印第2只猫
        cat3.show();//打印第3只猫
        //也可以直接打印:System.out.println("第2只猫的信息:"+cat2.name+" "+cat2.age);
    }
}



class Catcat {
    String name;
    int age;

    //无参构造和有参构造的出口
    public void show() {
        System.out.println("这只猫的信息:"+name+" "+age);
    }


    //有参构造器
    //1.构造器没有返回值，也不能写void
    //2.构造器的方法名和类名一样
    public Catcat(String name, int age){
        System.out.println("有2参调用成功");
        this.name=name;//this后面是类的成员变量
        this.age=age;
    }
    public Catcat(String name){
        System.out.println("有1参调用成功");
        this.name=name;
    }
    public Catcat(){
        System.out.println("无参调用成功！");
    }

}