package bufferedReader;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class B {
public static void main(String[] args) {
	try {
		FileWriter fw=new FileWriter("E://test files//A.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		bw.write("mike");
		bw.newLine();
		char[] ch= {'x','x'};
		bw.write(ch);
		bw.close();
		fw.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
