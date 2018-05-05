package File1;
import java.io.*;

public class File1 {
	public static void printFile(File f) throws IOException{
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s ="";
		while((s=br.readLine())!=null){
			System.out.println(s);
		}
	}
}
