package javaapplication21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

    public static void main(String ar[]) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try{
            in =new FileInputStream("input.txt");
            out =new FileOutputStream("output.txt");
            int c;
            while((c=in.read())!=-1)
            {
                out.write(c);
            }
        }
        finally{
            if(in!=null)
            {
                in.close();
            }
             if(out!=null)
            {
                out.close();
            }
        }
    }
}
