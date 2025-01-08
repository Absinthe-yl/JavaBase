package Java_Mind_mapping.常用类.Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class T01 {
    public static void main(String[] args) {
        Integer[] n1={-70,50,1,99,13};
        Integer[] arr={-1,0,1,2,3};
        System.out.println(Arrays.toString(n1)); //遍历数组

        Arrays.sort(n1); //默认排序:从小到大排序数组
        System.out.println("从小到大排序后数组:"+Arrays.toString(n1));
        //定制排序:传入两个参数: 1.排序的数组 2.实现了Comparator()接口的匿名内部类，要求实现compare方法
        Arrays.sort(n1, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1=(Integer) o1;
                Integer i2=(Integer) o2;
                return i2-i1;
                //retuen i2.属性(getPeice)-i1.属性
            }
        });
        System.out.println("从大到小排序后数组:"+Arrays.toString(n1));

        //查找 二分搜索 要求必须排列好 .binarySearch
        //如果数组中不存在，就return -(low+1)
        int index=Arrays.binarySearch(arr,0);
        System.out.println("index="+index);

        //数组元素的复制 .copyOf
        Integer[] newarr=Arrays.copyOf(arr,arr.length+1);
        System.out.println("copy后数组:"+Arrays.toString(newarr));

        //数组的覆盖 .fill
        Integer[] num1=new Integer[]{9,3,2};
        Arrays.fill(num1,0);
        System.out.println("初始化后数组:"+Arrays.toString(num1));

        //比较数组是否完全一致 .equals
        Integer[] num2={99,99,99};
        boolean equals=Arrays.equals(num1,num2);
        System.out.println(equals);

        //将一组值转换成List集合,List是一个接口  .asList
        List<Integer> asList=Arrays.asList(2,3,4,5,6,1);
        System.out.println("asList="+asList);
        System.out.println("asList的运行类型是"+asList.getClass());
    }
}
