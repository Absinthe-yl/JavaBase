package Java_Mind_mapping.IO流.创建文件;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;

public class T01 {
    public static void main(String[] args) {

    }
    //(方式1) new File(String pathname)
    @Test
    public void creat01(){
        String filePath="d:\\JAVAIO\\news1.txt";
        File file=new File(filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //(方式2) new File(File parent,String child) 父类目录+子类路径
    @Test
    public void creat02() {
        File parentfile = new File("d:\\JAVAIO");
        String filename = "news2.txt";
        File file =new File(parentfile,filename);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //(方式3) new File(String parent,String child) 父类目录+子类路径
    @Test
    public void creat03(){
        String parentPath ="d:\\JAVAIO";
        String fileName="news3.txt";
        File file =new File(parentPath,fileName);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
