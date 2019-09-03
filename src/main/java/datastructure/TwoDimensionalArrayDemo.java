package datastructure;

import utility.XLSXFileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Jahidul Islam
 * Construct Two Dimensional array reference variable and
 * store all the data of testData.xlsx from data directory
 * You do not have to read xlsx file only the similar data need to be
 * stored in 2D Array reference variable
 * Later get those value by index and also by using any iteration process
 *
 *  */
public class TwoDimensionalArrayDemo {

    public static void main(String[] args) throws Exception {
        XLSXFileReader obj= new XLSXFileReader();
   readarry("/Users/mdrahul/IdeaProjects/midtermbatch1902/src/main/java/db/DbConnection.java");

        String[][] word = obj.getExcelSheetData("excelWBook");
    //for (int i=0;i<word.length;i=+1)
        System.out.println(word);

    }



    public static String[] readarry(String file) throws FileNotFoundException {
        int count = 0;
        Scanner s1 = new Scanner(new File("/Users/mdrahul/IdeaProjects/midtermbatch1902/src/main/java/db/DbConnection.java"));
        while (s1.hasNextLine()) {
            count = count + 1;
            s1.nextLine();
        }
        String[] word = new String[count];
        Scanner s2 = new Scanner(new File(file));
        for (int i = 0; i < count; i = +1) {
            word[i] = s2.nextLine();
        }
        return word;
    }











}
