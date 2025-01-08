package Java_Mind_mapping.常用类.wrapper包装类.方法;

public class T01 {
    public static void main(String[] args) {
        //包装类-->String
        Integer i1=100;//自动装箱
        //方式1
        String str1=i1+"";
        //方式2
        String str2=i1.toString();
        //方式2
        String str3=String.valueOf(i1);

        //String-->包装类
        String str4="12345";
        Integer i2=Integer.parseInt(str4);//自动装箱,parseInt字符串str转换为十进制的数字，默认为十进制
        Integer i3=new Integer(str4);//构造器ctrl+B查看
    }
}
