package fileWriter;

import java.io.File;
import java.io.FileWriter;

public class D {
public static void main(String[] args) {
	
	try {
		File f=new File("E://test files//A.txt");
		FileWriter fw=new FileWriter(f);
		char[] ch= {'a','b'};
		fw.write(ch);
		fw.flush();
		fw.close();

	
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
