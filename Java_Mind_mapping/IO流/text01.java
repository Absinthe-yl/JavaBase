package Java_Mind_mapping.IO流;

import java.io.FileOutputStream;
import java.io.*;
import java.io.BufferedOutputStream;
public class text01 {
    public static void main(String args[]) {
        String filePathone="d:\\JAVAIO\\one.txt";
        String filePathtwo="d:\\JAVAIO\\two.txt";
        FileOutputStream out01=null;
        BufferedOutputStream out02=null;
        try {
            out01=new FileOutputStream(filePathone);
            //out02=new BufferedOutputStream(filePathtwo);
            //out01.write(str1.getBytes()); //.getBytes():字符串转成byte[]数组
            //写入一串字符 方法(2)
            //out01.write(str1.getBytes(),0,str1.length());  //范围[0,length)

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                out01.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
