package bufferedReader;

import java.io.FileWriter;
import java.util.Scanner;

public class C {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your content");
	String content=sc.next();
	
	try {
	FileWriter fw=new FileWriter("E://test files//A.txt");
	fw.write(content);
	fw.flush();
	fw.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	}
}
