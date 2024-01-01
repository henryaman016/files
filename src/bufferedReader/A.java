package bufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class A {
	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("E//test files//A.txt");
			BufferedReader br=new BufferedReader(fr);
			for(int i=0;i<5;i++) {
				System.out.println(br.readLine());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
