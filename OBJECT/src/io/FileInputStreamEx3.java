package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// FileInputStram 
public class FileInputStreamEx3 {
    public static void main(String[] args) {
        // 입력 스트림 : file 에서 읽어오기

        // fis = new FileInputStream(new File("c\\temp\\file1.txt"));

        // try- with-resources
        // try(닫아야 하는 자원) : finally 안에 닫기 명시하지 않아도 자동으로 닫아 줌
        try (FileInputStream fis = new FileInputStream("c:\\temp\\image2.jpg");
                FileOutputStream fos = new FileOutputStream("c:\\temp\\output_.jpg")) {

            int data = 0;
            // read() : 1byte 씩 읽어오기
            // while ((data = fis.read()) != -1) {
            // // System.out.println((char) data);
            // fos.write(data);
            // }

            // 1024 바이트로 읽고. 1024 바이트로 쓰고
            byte b[] = new byte[1024];
            while ((data = fis.read(b)) != -1) {
                fos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
