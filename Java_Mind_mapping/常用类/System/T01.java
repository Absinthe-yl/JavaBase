package Java_Mind_mapping.常用类.System;

import java.util.Arrays;

public class T01 {
    public static void main(String[] args) {
        //arraycopy 复制数组元素，底层调用
        int[] src={1,2,3};
        int[] dest=new int[3]; //当前是{0，0，0}
        System.arraycopy(src,0,dest,0,3);//从原数组的第0位复制到数组的第0位
        System.out.println(Arrays.toString(dest));

        //currentTimeMillens 返回当前时间距离1970-1-1的毫秒数
        System.out.println(System.currentTimeMillis());

        //exit 退出当前程序
        System.out.println("ok1");
        System.exit(0);
        System.out.println("ok2");
    }
}
