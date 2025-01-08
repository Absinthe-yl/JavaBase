package Java_Mind_mapping.常用类.常见方法;
/*
(1) equals():区分大小写比较内容是否相等
(2) equalsIgnoreCase():忽略大小写比较内容是否相等
(3) length():返回字符串长度
(4) indexOf():获取字符串对象第一次出现的索引，从0开始，找不到返回-1,若输入字符串则返回第一个字符的位置
(5) lastIndexOf():获取字符串对象最后一次出现的索引，找不到返回-1
(6) substring():截取指定范围的子串
(7) toUpperCase():转换成大写
(8) toLowerCase():转换成小写
(9) concat():拼接字符串
(10) replace():替换字符串中的字符,只有str1.replace()执行后的结果被替换，不会改变str1本身
(11) split():分割字符串
(12) toCharArray():转换成字符数组
(13) compareTo():比较两个字符串的大小,长度不相等则返回长度差值，长度相等则返回从左开始第一个不相等的字符的ASCII码差值
(14) format:格式化字符串
 */
public class T01 {
    public static void main(String[] args){
        String str1="abcabc";
        String str2="ABCABC";
        String poem="锄禾日当午,汗滴禾下土,谁知盘中餐,粒粒皆辛苦";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println("cjl万岁万岁万万岁".length());
        System.out.println("单个字符索引:"+str1.indexOf('c')+"\n字符串索引取第一位的位置:"+str1.indexOf("ca"));
        System.out.println(str1.lastIndexOf("c"));
        System.out.println(str1.substring(3)); //截取第3位及其后面的字符串
        System.out.println(str1.substring(3,5)); //截取第3位(包括3)到第5位(不包括5)的字符串[3,5)
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.concat(str2).concat("cjl万岁万岁万万岁"));
        System.out.println(str1.replace("ab","万岁")); //后者replacement替换前者str1中target的【所有相同内容】
        String[] p1=poem.split(","); //以","分割字符串并存放在p1数组中
        for(int i=0;i<p1.length;i++){
            System.out.println(p1[i]);
        }
        poem = "E:\\aaa\\bbb"; p1=poem.split("\\\\"); //第一位和第三位为转义字符\
        for(int i=0;i<p1.length;i++){
            System.out.println(p1[i]);
        }
        char[] ch=str1.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]+" ");
        }
        System.out.println("\n"+str1.compareTo(str2));


        String name="cjl";
        int age=10;
        double score=98.3/3;
        char gender='男';
        String p6="名字是%s年龄%d是成绩是%.2f性别是%c";
        String info1="名字是"+name+"年龄是"+age+"成绩是"+score+"性别是"+gender;
        String info2=String.format(p6,name,age,score,gender); //p6可以直接改成-->"名字是%s年龄%d是成绩是%.2f性别是%c"
        System.out.println(info1);
        System.out.println(info2);
    }
}
