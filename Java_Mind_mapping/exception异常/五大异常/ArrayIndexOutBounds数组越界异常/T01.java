package Java_Mind_mapping.exception异常.五大异常.ArrayIndexOutBounds数组越界异常;

public class T01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        for (int i = 0; i <=arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
