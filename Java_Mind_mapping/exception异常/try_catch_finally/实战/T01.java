package Java_Mind_mapping.exception异常.try_catch_finally.实战;

import java.util.Scanner;

public class T01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        String str;
        while(true){
            System.out.println("请输入一个数");
            str=sc.next();
            try {
                num=Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.println("你输入的不是一个整数");
            }
        }
    }
}
