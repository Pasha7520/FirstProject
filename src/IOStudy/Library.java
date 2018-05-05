package IOStudy;

import java.io.*;

public class Library {
	private final File FILE = new File ("test.txt");
	 
	public String readAllBooks() throws IOException{
		String allBooks = "";
		FileReader fr = new FileReader(FILE);
		BufferedReader br = new BufferedReader(fr);
		String s = "";
		while ((s=br.readLine())!=null){
			allBooks = allBooks + s + "\n";
		}
		return allBooks;
	}
	
	public void addBook(String author,String name,int year) throws IOException{
		int id;
		FileWriter fw = new FileWriter(FILE , true);
		BufferedWriter bw = new BufferedWriter(fw);
		FileReader fr = new FileReader(FILE);
		BufferedReader br = new BufferedReader(fr);
		String s ="";
		String lastline = "";
		while((s=br.readLine())!=null){
			lastline=s;
			System.out.println(lastline);
		}
		System.out.println(lastline.length());
		
		String Sid ="";
		for(int i=0; i < lastline.length();i++){
			if(lastline.charAt(i)!=','){
				Sid=Sid+lastline.charAt(i);
				
			}
			else{
				break;
			}
		}
		id = Integer.parseInt(Sid);
		
		bw.newLine();
		bw.write((id+1)+", "+author+ ", "+name+", "+year+";");
		bw.close();
		fw.close();
		
		
		
		
		
		
	}
	
	public void deleteBookById(int id) throws IOException{
		
		FileReader fr = new FileReader(FILE);
		BufferedReader br = new BufferedReader(fr);
		String s = "";
		String allBooks = "";
		String Strnew = "";
		while((s=br.readLine())!=null){
			allBooks = allBooks + s + "\n";

		}
		String [] ss = allBooks.split("\n");
		FileWriter fw = new FileWriter(FILE,false);
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(int i = 0;i < ss.length;i++){
			if((i+1)!=id){
			
				bw.write(ss[i]);
				bw.newLine();
			}
			else{}
			
		}
		
		
		bw.close();
		fw.close();
		
	}
	
	public String getBookById(int id) throws IOException{
		FileReader fr = new FileReader(FILE);
		BufferedReader br = new BufferedReader(fr);
		String s = "";
		for(int i = 1;i <=id;i++){
			s = br.readLine();
		}
		
		return s;
	}
	
	
	public void updateBookById(int id, String name, String author, int year) throws IOException{
		FileReader fr = new FileReader(FILE);
		BufferedReader br = new BufferedReader(fr);
		String s = "";
		String allBooks = "";
		String Strnew = "";
		while((s=br.readLine())!=null){
			allBooks = allBooks + s + "\n";

		}
		String [] ss = allBooks.split("\n");
		FileWriter fw = new FileWriter(FILE,false);
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(int i = 0;i < ss.length;i++){
			if((i+1)!=id){
			
				bw.write(ss[i]);
				bw.newLine();
			}
			else{bw.write((id)+", "+author+ ", "+name+", "+year+";"+"\n");}
			
		}
		
		
		bw.close();
		fw.close();
		
	}
}
