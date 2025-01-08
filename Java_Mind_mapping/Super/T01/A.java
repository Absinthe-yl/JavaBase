package Java_Mind_mapping.Super.T01;

public class A{

    //=====属性=====
    public int n1=1;
    protected int n2=2;
    int n3=3;
    private int n4=4;

    //=====方法区=====
    public void test100(){}
    protected void test200(){}
    void test300(){System.out.println("成功访问到父类方法test300");}
    private void test400(){}

    //=====构造器=====
    public A(){
        System.out.println("父类无参构造器被子类super()调用");
    }
    public A(String name){}
    public A(String name,int age){}
}
