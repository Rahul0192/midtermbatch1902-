package Reader;

import java.io.*;

public class DataReader {
	/**
	 * Use API to read the below textFile and print to console.
	 * /src/main/resources/Key-To-Success
	 * Use FileReader class, no need to store in buffer
	 * Use try....catch block to handle Exception.
	 * Use ForEach loop/while loop/Iterator to retrieve data.
	 */
	public static void main(String[] args) throws IOException {
	readData();
		}

	public static String readData() throws IOException {
		String pathename=System.getProperty("user.dir")+"/src/main/resources/Key-To-Success";
		File file=new File(pathename);
		FileReader filerader =null;
		try {
			filerader= new FileReader(file);

		}
		catch (Exception e){
			e.printStackTrace();
		}
		int i;
		while ((i=filerader.read())!=-1)
			System.out.print((char) i);
		return pathename;
	}



	}










