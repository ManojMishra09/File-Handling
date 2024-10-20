package file_handling;

import java.io.File;
import java.io.IOException;

public class Create_File {
public static void main(String[] args) {
	File file= new File("E:\\ADJ\\manojj123");
	try {
		boolean iscreated= file.createNewFile();
		if(iscreated)
		{
			System.out.println("file created");
		}
		else {
			System.out.println("file is exits");
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
