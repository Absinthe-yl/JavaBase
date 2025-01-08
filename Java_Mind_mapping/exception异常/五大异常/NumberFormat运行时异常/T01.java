package Java_Mind_mapping.exception异常.五大异常.NumberFormat运行时异常;

public class T01 {
    public static void main(String[] args) {
        //String name="12345";
        String name="陈珏龙";
        //将String转成int
        int num =Integer.parseInt(name);
        System.out.println(num);
    }
}
