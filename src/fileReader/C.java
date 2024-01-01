package fileReader;

import java.io.File;
import java.io.FileWriter;

public class C {
public static void main(String[] args) {
	try {
		File f=new File("E://test files//B.txt");
		FileWriter fw=new FileWriter(f);
		fw.write("mike");
		
		fw.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
