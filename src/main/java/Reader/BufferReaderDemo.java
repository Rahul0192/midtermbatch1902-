package Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {


    /**

     *  Use BufferReader to read from buffer while reading Key-To-Success.txt from main/java/resources
     * */
    public static void main(String[] args) {

      readFile();
        }

    public static String readFile() {

    File file=new File(System.getProperty("user.dir")+"/src/main/resources/Key-To-Success");
        try {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int i;
        while ((i=bufferedReader.read())!=-1){
            System.out.print((char)i);
        }
    }
        catch (IOException e){
        e.printStackTrace();


}
        return null;
    }
}













