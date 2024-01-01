package files;

import java.io.File;

public class D {
public static void main(String[] args) {
	
	try {
		File f=new File("E://test files//B.txt");
		boolean val=f.createNewFile();
	System.out.println(val);	
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
