package Java_Mind_mapping.overload重载;

import sun.util.resources.ms.CalendarData_ms_MY;

public class T01 {
    public static void main(String[] args){
        myCalculator mc = new myCalculator();
        int[] res = mc.calculate(1,2);//定义一个res数组来接收res1数组(也就是第一个calculate方法的结果)

        System.out.println("和："+res[0]+"  差："+res[1]);
        System.out.println(mc.calculate(1,1.2));
        System.out.println(mc.calculate(1,1,1.2));  //这里输入的是什么类型，就会对对应进入下面的重载方法计算
    }
}

class myCalculator{

    //下面的三个方法名字相同，参数类型、数量不同，构成重载
    public int[] calculate(int a, int b){
        int[] res1=new int[2];
        res1[0]=a+b;
        res1[1]=a-b;
        return res1;
    }
    public double calculate(int a,double b){
        return a+b;
    }
    public double calculate(int a,int b,double c){
        return a+b+c;
    }
}