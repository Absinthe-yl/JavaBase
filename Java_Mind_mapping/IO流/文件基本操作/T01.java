package Java_Mind_mapping.IO流.文件基本操作;

import org.junit.jupiter.api.Test;

import java.io.File;

public class T01 {
    public static void main(String[] args) {

    }
    @Test
    //获取文件信息
    public void info(){
        //创建文件对象
        File file = new File ("d:\\JAVAIO\\news1.txt");
        System.out.println("文件名字"+file.getName());
        System.out.println("文件绝对路径="+file.getAbsolutePath());
        System.out.println("文件父级目录="+file.getParent());
        System.out.println("文件大小(字节)="+file.length());
        System.out.println("文件是否存在="+file.exists());
        System.out.println("是不是一个目录="+file.isFile());
        System.out.println("是不是一个文件="+file.isDirectory());
    }
    @Test
    //判断文件是否存在，存在就删除
    public void m1(){
        String filePath="d:\\JAVAIO\\news2.txt";
        File file=new File(filePath);
        if(file.exists()){
            if(file.delete()){ //这里是true
                System.out.println(filePath+"删除成功");
            }else {
                System.out.println(filePath+"删除失败");
            }
        }else {
            System.out.println("文件不存在");
        }
    }
    @Test
    //判断目录是否存在，存在就删除 目录当文件处理
    public void m2(){
        String filePath="d:\\JAVAIO\\cjl";
        File file=new File(filePath);
        if(file.exists()){
            if(file.delete()){ //这里是true
                System.out.println(filePath+"删除成功");
            }else {
                System.out.println(filePath+"删除失败");
            }
        }else {
            System.out.println("文件不存在");
        }
    }
    @Test
    //判断目录是否存在，存在就提示存在，不存在就创建
    //只创建一级目录只需要mkdir()
    public void m3(){
        String directoryPath="d:\\JAVAIO\\text01\\a\\b\\c";
        File file=new File(directoryPath);
        if(file.exists()){
            System.out.println(directoryPath+"存在。。");
        }else {
            System.out.println("文件不存在");
            if(file.mkdirs()){
                System.out.println("创建成功");
            }else {
                System.out.println(directoryPath+"创建失败");
            }
        }
    }
}

