package fileReader;

import java.io.File;
import java.io.FileReader;

public class B {
public static void main(String[] args) {
	
	try {
		File f=new File("E://test files//A.txt");
FileReader fr=new FileReader(f);
char[] ch=new char[(int)f.length()];
fr.read(ch);
for(char c:ch) {
	System.out.println(c);
	fr.close();
}
	
	}catch(Exception e) {
		
	}
}
}
