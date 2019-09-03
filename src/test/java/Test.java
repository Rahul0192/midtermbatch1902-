import CalcuateSalary.SalaryCalulator;
import Reader.BufferReaderDemo;
import Reader.DataReader;
import Reader.ReadFromAFileAndWriteInAnotherFile;
import org.testng.Assert;

import java.io.IOException;

@org.testng.annotations.Test

public class Test {


    public void add() {
        BufferReaderDemo obj = new BufferReaderDemo();
        String actualresult = obj.readFile();
        String extectedresult = actualresult;

        Assert.assertEquals(actualresult, extectedresult);
        System.out.println("The result is fail");
    }

    public void dataTest() throws IOException {
        DataReader dataReader = new DataReader();
        String actualresult = dataReader.readData();
        String exceptresult = actualresult;
        Assert.assertEquals(actualresult, exceptresult);
        System.out.println("test pass");

    }

    public void readfileTest() throws IOException {
        ReadFromAFileAndWriteInAnotherFile obj = new ReadFromAFileAndWriteInAnotherFile();
        String actualResult = obj.readAnotherFile();
        String exceptResult = actualResult;
        Assert.assertEquals(actualResult, exceptResult);
        System.out.println("test pass");


    }


}