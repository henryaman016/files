package fileReader;

import java.io.File;
import java.io.FileReader;

public class A {
public static void main(String[] args) {
	try {
		File f=new File("E://test files//A.txt");
		FileReader fr=new FileReader(f);
		for(int i=0;i<f.length();i++) {
			System.out.println((char) fr.read());
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
