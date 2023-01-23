package filehandling;

import java.io.*;

public class FileEx1 {
	public static void main(String[] args) throws IOException {
		File f = new File("D://java.txt");
		PrintWriter ob = new PrintWriter(f);
		ob.println("This is the last class : tata bie bie ");
		ob.println("Babu Bhaiya Zindabaad :");
		ob.close();

		FileReader obj = new FileReader(f);
		BufferedReader bf = BufferedReader(obj);
		String s = bf.readLine();
		while (s != null) {
			System.out.println(s);
			s = bf.readLine();
		}
	}

	private static BufferedReader BufferedReader(FileReader obj) {
		// TODO Auto-generated method stub
		return null;
	}
}
