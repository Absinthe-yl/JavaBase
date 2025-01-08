package Java_Mind_mapping.Variadics可变参数;

public class T01 {
    public static void main(String[] args){
        kbcs kk = new kbcs();
        System.out.println(kk.sum01(1,2,3));
        System.out.println(kk.sum01(1,2,1000));
        int[] arr = {1,2,3,4,5};
        System.out.println(kk.sum01(arr));  //可以传入数组


        kbcs str = new kbcs();
        System.out.println(str.sum02("abcd",arr));  //可以传入字符串
    }
}
class kbcs{
    //int...表示可接受0个及以上多个可变参数，类型是int
    //nums可以当作数组
     public int sum01(int... nums){
        System.out.println("可接受的参数有个数"+nums.length);
        int res=0;
        for(int i=0; i<nums.length; i++){
            res += nums[i];
        }
        return res;
     }

    //可变参数能和普通参数放在一起，但是可变参数只能在最后
    //有且仅有一个可变参数 
    public int sum02(String str,int... nums){
        System.out.println("====================");
        return str.length();
    }
}

