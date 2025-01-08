package Java_Mind_mapping.IO流.拷贝;

import java.io.*;

public class T01 {
    public static void main(String[] args) {
     //将文件d:\\JAVAIO\\a.txt拷贝到d:\\JAVAIO2\\a.txt
        String srcPath="d:\\JAVAIO\\pic.png"; //原文件
        String destPath="D:\\JAVAIO2\\pic_copy.png"; //目标文件
        FileInputStream in=null;
        FileOutputStream out=null;
        try {

            in=new FileInputStream(srcPath);
            out=new FileOutputStream(destPath);
            //定义一个字节数组
            byte[] buf=new byte[1024];
            int readlen=0;
            while ((readlen=in.read(buf))!=-1){
                //边读边写
                out.write(buf,0,readlen);
            }
            System.out.println("拷贝成功！");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if(in!=null) {
                    in.close();
                }
                if(out!=null) {
                    out.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
