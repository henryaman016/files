package files;

import java.io.File;

public class C {
public static void main(String[] args) {
	File f=new File("E://test files//A.txt");
	boolean val=f.delete();
	System.out.println(val);
}
}
