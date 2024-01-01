package files;

import java.io.File;

public class B {
public static void main(String[] args) {
	File f=new File("E://test files//A.txt");
	boolean val=f.exists();
	System.out.println(val);
}
}
