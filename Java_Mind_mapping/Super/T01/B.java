package Java_Mind_mapping.Super.T01;

public class B extends A {
    public void hi(){
        //访问父类属性
        System.out.println(super.n1+super.n2+super.n3);
    }
    public void ok(){
        //调用父类方法
        //(1) 先找本类，如果有则调用
        //(2) 本类没有找父类(如果有且可以调用则调用）
        //(3) 父类没有，继续找父类的父类，直到object
        test100();//与this.test100完全等价
        super.test200();//跳过(1)直接进入(2)
        super.test300();
    }
    //构造器
    public B(){
        //super();
        //super("cjl");
        //super("cjl",20);
    }

    public void sum(){
        System.out.println("子类B的sum方法");
        //调用父类的方法

    }
}
