package file_handling;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

public class Read_file {
public static void main(String[] args) {
	File file=new File("\"E:\\ADJ\\manoj1.txt\"");
	if(file.exists())
	{
		try {
			FileInputStream fis= new FileInputStream(file);
			int n= fis.read();
			while(n!=-1)
			{
				System.out.println((char) n);
				n=fis.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	else {
		System.out.println("file is missing");
	}
	
}
}
