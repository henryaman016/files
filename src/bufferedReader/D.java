package bufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class D {
public static void main(String[] args) {
	
	try {
		FileReader fr=new FileReader("E://test files//A.txt");
		BufferedReader br=new BufferedReader(fr);
		String Content=br.readLine();
		FileWriter fw=new FileWriter("E://test files//B.txt");
		fw.write(Content);
		fw.flush();
		fw.close();
		
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
