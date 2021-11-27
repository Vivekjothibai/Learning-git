package git2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingTheTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	File f=new File("C:\\wrokspace\\vivek_workspace\\B1_FileHandling\\Textfile.orgin.txt");
		
		System.out.println(f.exists());
		
		if (f.exists()!=true) {
			f.createNewFile();
		} else {
           System.out.println("The file already exsis");
		}
	
	FileReader fr=new FileReader(f);
	BufferedReader br= new BufferedReader(fr);
    System.out.println(br.readLine());   //reads lines one by one need to use loop to fetch all data 
	
    String storeddata="";
    
	while ((storeddata=br.readLine())!=null) {
		System.out.println(storeddata);
	}
	
	
	
	}
	
	

}
