package fileWriter;

import java.io.File;
import java.io.FileWriter;

public class A {
public static void main(String[] args) {
	
	try {
		File f=new File("E://test files//A.txt");
		FileWriter fw=new FileWriter(f);
		fw.write("\n");
		fw.write("mike");
		fw.write("\n");
		fw.write("stallin");
		fw.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
