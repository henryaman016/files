package files;

import java.io.File;

public class F {
public static void main(String[] args) {
	File f=new File("E://test files//p1");
	boolean val=f.mkdir();
	System.out.println(val);
}
}
