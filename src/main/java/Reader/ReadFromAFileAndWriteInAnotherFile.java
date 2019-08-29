package Reader;

import com.sun.codemodel.internal.writer.FileCodeWriter;

import java.io.*;

/***
 * Read form a file XXXXXX write in a file YYYYYY
 *
 * */
public class ReadFromAFileAndWriteInAnotherFile {
    public static void main(String[] args) throws IOException {
        String xFile=System.getProperty("user.dir")+ "/src/main/resources/xFile";
        String yFile=System.getProperty("user.dir")+"/src/main/resources/yFile";
        FileReader readfile= new FileReader(xFile);
        FileOutputStream writefile= new FileOutputStream(yFile);
         int i;
         while((i=readfile.read())!=-1){
             writefile.write(i);
             System.out.print((char)i);
         }


    }








}
