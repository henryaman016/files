package fileWriter;

import java.io.File;
import java.io.FileWriter;

public class B {
public static void main(String[] args) {
	
	try {
		File f=new File("E://test files//A.txt");
		FileWriter fw=new FileWriter(f);
		fw.write(100);
		fw.write("\\nmike");
		fw.write("\n");
		fw.write(10);
		fw.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
	
}
}
