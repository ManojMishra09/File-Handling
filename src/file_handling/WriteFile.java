package file_handling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) {
		File file =new File("E:\\ADJ\\\\manoj222");
		try {
			FileOutputStream fos= new FileOutputStream(file,true);
			String s= "hello my name is manoj";
			byte []b=s.getBytes();
			fos.write(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}}

