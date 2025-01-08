package Java_Mind_mapping.常用类.wrapper包装类;
/*
基本数据类型:boolean  char        byte  short  int      long  float  double
包装类:    [Boolean  Character  (Byte  Short  Integer  Long  Float  Double) 父类:Number ] 父类:Object

(1)当Integer值在-128到127之间时，JVM会缓存这些对象，导致"=="比较返回true,超过范围则会return new Integer(i),这时"=="比较地址返回false
*/
public class T01 {
    public static void main(String[] args) {
        int n1=100;
        //(1) 装箱 int --> Integer
        // 1.手动装箱
        Integer m1=new Integer(n1);
        Integer m2=Integer.valueOf(n1);
        // 2.自动装箱
        Integer m3=n1; //底层和手动装箱是一样的

        //(2)拆箱 Integer --> int
        // 1.手动拆箱
        int n2=m1.intValue();
        // 2.自动拆箱
        int n3=m3;//底层和手动拆箱是一样的int m3=new Integer(n1)

        Object obj1=true?new Integer(1):new Double(2.0); //三元运算符是一个整体
        System.out.println(obj1);
        Object obj2;
        if(true){
            obj2=new Integer(1);
        }else{
            obj2=new Double(2.0);
        }
        System.out.println(obj2);
    }
}
