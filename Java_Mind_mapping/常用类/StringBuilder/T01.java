package Java_Mind_mapping.常用类.StringBuilder;
/*
也是可变字符序列，提供一个与StringBuffer兼容的API，但不保证同步(线程不安全)，
通常被用作StringBuffer的简易替换，用在字符串缓冲区单个线程使用时，尽量使用这个，它比StringBuffer快
使用方法和StringBuffer一样
(1)StringBuilder的方法，没有做互斥处理，即没有synchronized（同步）关键字，因此推荐单线程使用
(2)效率:StringBuilder > StringBuffer > String
 */
public class T01 {
}
