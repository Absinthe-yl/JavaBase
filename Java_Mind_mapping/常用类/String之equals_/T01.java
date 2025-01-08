package Java_Mind_mapping.常用类.String之equals_;
/*
(1)字符串使用Unicode字符编码，一个字符占两个字节
(2)String是final修饰不能被继承
(3)String 有属性private final char value[];用于存放字符串内容
    value是一个final类型，不可修改(不可修改指向新的地址，但内容可以)
    报错:java: 无法为最终变量v1分配值
    final char[] v1={'1','2','3'};
    char[] v2={'a','b','c'};
    v1=v2;
 */
public class T01 {
    public static void main(String[] args) {
        base01 p1=new base01();
        p1.name="cjl";
        base01 p2=new base01();
        p2.name="cjl";
        //输出
        System.out.println(p1.name.equals(p2.name));
        System.out.println(p1.name==p2.name);
        System.out.println(p1.name=="cjl");


        String n1="abc"; //n1先在常量池查找abc，没有便在池里创建abc,并指向常量池abc
        String n2="abc";//常量池里有n1创建的abc，所以n2直接指向常量池的abc，n1、n2指向的地址相同
        String n3=new String("abc"); //n3指向的是堆中的对象(value),value去常量池查看有无abc,有则直接指向，没有则创建再指向(栈n3—>堆value—>方法区内(常量池abc))
        String n4=new String("abc");
        //输出
        System.out.println("n1和n2的equals比较:  "+n1.equals(n2)); //比较值
        System.out.print("n1和n2的==比较:  ");
        System.out.println(n1==n2); //String属于引用类型，比较地址所以返回地址是一样的
        System.out.println("n1和n3的equals比较:  "+n1.equals(n3));
        System.out.print("n1和n3的==比较:  ");
        System.out.println(n1==n3); //n1指向的是常量池abc,n3指向的堆里的对象value
        System.out.print("n1和n3.intern的==比较:  ");
        System.out.println(n1==n3.intern()); //调用intern: (1)常量池已经存在等于(equals方法)该String类的字符串，则返回池中的 (2)若没有，则将String对象添加到池中再返回String对象的引用
        System.out.print("n3和n3.intern的==比较:  ");
        System.out.println(n3==n3.intern());//n3指向堆，n3.intern()指向的常量池
        System.out.print("n3和n4的==比较:   ");
        System.out.println(n3==n4);//n3、n4指向堆里不同的对象，但不同对象指向的是同一个常量池的abc

    }
}
class base01{
    public String name;

}
