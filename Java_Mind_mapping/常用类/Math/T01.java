package Java_Mind_mapping.常用类.Math;
/*
(1) Math方法基本上都是static的
 */
public class T01 {
    public static void main(String[] args) {
        int abs=Math.abs(-1);
        double pow=Math.pow(2,8);
        double ceil=Math.ceil(-3.001); //向上取整，返回>=该参数的最小整数
        double floor=Math.floor(-3.999); //向下取整，返回<=该参数的最小整数
        long round=Math.round(-5.001); //四舍五入
        double sqrt=Math.sqrt(9.0);
        //random 返回[0,1)之间的随机小数
        //eg:随机抽取2~7的整数
        for (int i=0;i<10;i++){
            System.out.println((int) (2+Math.random()*(7-2+1)));
            //随机抽取[a,b]直接的整数的原公式:  (int)(a+Math.random()*(b-a-1))  为什么-1,random返回[0,1)
        }
        //最大最小值 min、max
        int min=Math.min(1,9);
        int max=Math.max(1,9);
        System.out.println(min);
        System.out.println(max);
    }
}