package Java_Mind_mapping.IO流.InOutputstream;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class out {
    public static void main(String[] args) {

    }
    @Test
    public void writeFIle(){
        String filePath="d:\\JAVAIO\\a.txt";
        FileOutputStream out01=null;
        try {
            //out01=new FileOutputStream(filePath);
            out01=new FileOutputStream(filePath,true); //追加内容，而不是覆盖
            //写入一个字节
            //out01.write('a');
            //写入一串字符 方法(1)
            String str1="hello,world";
            //out01.write(str1.getBytes()); //.getBytes():字符串转成byte[]数组
            //写入一串字符 方法(2)
            out01.write(str1.getBytes(),0,str1.length());  //范围[0,length)

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

