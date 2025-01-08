package Java_Mind_mapping.inherit继承.继承测试题;
import java.util.Scanner;
public class t02{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double length = scan.nextDouble();
        double wide = scan.nextDouble();
        Rectangle r = new Rectangle(length,wide);
        System.out.printf("%.2f ",r.getPerimeter());
        System.out.printf("%.2f",r.getArea());
        System.out.println();

        length = scan.nextDouble();
        wide = scan.nextDouble();
        double height = scan.nextDouble();
        Cuboid  c = new Cuboid (length,wide,height);
        System.out.printf("%.2f ",c.getPerimeter());
        System.out.printf("%.2f ",c.getArea());
        System.out.printf("%.2f",c.getVolume());

        scan.close();
    }
}

/* 你的代码被嵌在这里 */
class Rectangle{
    double length;
    double wide;

    //接受传参
    public Rectangle(double length, double wide) {
        this.length = length;
        this.wide = wide;
    }
    //方法调用传参
    public double getPerimeter() {
        return 2 * (length + wide);
    }

    public double getArea() {
        return length * wide;
    }
}
class Cuboid extends Rectangle{
     double height;
    public Cuboid(double length, double wide, double height) {
        super(length,wide);
        this.height = height;
    }
    public double getPerimeter() {
        return (length+wide+height)*4;
    }

    public double getArea() {
        return 2 * (length * wide + wide * height + height * length); // 表面积公式
    }

    public double getVolume() {
        return length * wide * height;
    }
}