package file_handling;

import java.io.File;

public class CreateMkdir {
public static void main(String[] args) {
	boolean file = new File("E:\\ADJ\\kamal").mkdir();
	if(true)
	{
		System.out.println("file created");
	}
	else
	{
		System.out.println("it is exits");
	}
}
}
