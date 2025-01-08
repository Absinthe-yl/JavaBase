package Java_Mind_mapping.IO流.InOutputstream;

import org.junit.jupiter.api.Test;
import java.io.FileInputStream;
import java.io.IOException;

/*
(1)流分为 1.字节流(1个字节=8bit)  2.字符流
(2)
(抽象类)    字节流         字符流
输入流   inputstream      Reader
输出流   outputstream     Writer

 */
public class in {
    public static void main(String[] args) {

    }
    @Test
    public void readFile01(){
        String filePath="d:\\JAVAIO\\news3.txt";
        int readDate=0;
        FileInputStream fileInputStream=null;
        try {
            //创建FileInputStream对象，用于读取文件
            fileInputStream = new FileInputStream(filePath);
            while ((readDate=fileInputStream.read())!=-1){
                System.out.print((char)readDate);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            //关闭文件流释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Test
    public void readFile02(){
        String filePath="d:\\JAVAIO\\news3.txt";
        int readDate=0;
        //字节数组
        byte[] buf=new byte[8];//一次性读入8个字节
        FileInputStream fileInputStream=null;
        try {
            //创建FileInputStream对象，用于读取文件
            fileInputStream = new FileInputStream(filePath);
            while ((readDate=fileInputStream.read(buf))!=-1){
                //返回实际读取的字节数，这里最多8个
                System.out.print(new String(buf,0, readDate));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            //关闭文件流释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
