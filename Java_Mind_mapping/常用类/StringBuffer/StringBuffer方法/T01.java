package Java_Mind_mapping.常用类.StringBuffer.StringBuffer方法;

public class T01 {
    public static void main(String[] args){
        //(1)增
        StringBuffer s=new StringBuffer("hello");
        s.append(",");
        s.append("袁浪");
        s.append("你好").append("113").append("true");
        System.out.println(s);

        //删 删除[10,13)
        s.delete(10,13);
        System.out.println(s);

        //改 替换[10,14)
        s.replace(10,14,",我是cjl");
        System.out.println(s);

        //插
        s.insert(11,"自我介绍一下");
        System.out.println(s);

        //长度
        System.out.println(s.length());


        //实例
        String price="1234567.99";
        StringBuffer sb=new StringBuffer(price);
        for(int i=sb.lastIndexOf(".")-3;i>0;i-=3){
            sb=sb.insert(i,",");
        }
        System.out.println(sb);
    }
}
