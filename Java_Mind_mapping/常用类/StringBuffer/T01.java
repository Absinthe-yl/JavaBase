package Java_Mind_mapping.常用类.StringBuffer;
/*
(1) StringBuffer的直接父类是AbstractStringBuilder
(2) StringBuffer实现了Serializable,即StringBuffer的对象可以串行化
(3) 在父类中AbstractStringBuilder有属性char[] value,不是final,该数组存放字符串内容，存放在堆中
(4) StringBuffer是一个final类，不能被继承
(5) 因为StringBuffer字符内容是存放在char[] value,所在变化增减，不用更换地址也不用创建新的对象，效率高于String,String总会在常量池中增加新的对象
 */
public class T01 {
}
