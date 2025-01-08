package Java_Mind_mapping.常用类.StringBuffer.转换;

public class T01 {
    public static void main(String[] args) {
        //(1) 构建一个大小为16的char[],用于存放字符内容
        StringBuffer sb01=new StringBuffer();
        //(2) 通过构造器指定char[]的大小
        StringBuffer sb02=new StringBuffer(100);
        //(3) 通过给String创建StringBuffer,char[]大小就是str.length()+16
        StringBuffer hello=new StringBuffer("hello"); //"hello"是字符串,长度是 "hello".length()+16


        //String-->StringBuffer
        String str="cjl";
        //(1) 使用构造器
        StringBuffer sb1=new StringBuffer(str);
        //(2) 调用append()方法 拼接
        StringBuffer sb2=new StringBuffer();
        StringBuffer sb3=sb2.append(str);

        //StringBuffer-->String
        StringBuffer sb4=new StringBuffer("abc");
        //(1) 使用StringBuffer提供的toString()方法
        String str2=sb4.toString();
        //(2) 使用构造器
        String str3=new String(sb4);
    }
}
