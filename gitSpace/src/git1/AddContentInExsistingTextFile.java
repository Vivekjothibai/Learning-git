package git1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AddContentInExsistingTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f=new File("C:\\wrokspace\\vivek_workspace\\B1_FileHandling\\Textfile.orgin.txt");
		
		System.out.println(f.exists());
		
		if (f.exists()!=true) {
			f.createNewFile();
		} else {
           System.out.println("The file already exsis");
		}
	
	FileWriter fw = new FileWriter(f,true);    // if we provide true statment it will append the content in exsisting text file 
	BufferedWriter bw = new BufferedWriter(fw);  
	bw.write("Tendulkar");
	bw.newLine();               
	bw.write("koshy");
	bw.newLine();
	bw.write("Kholi");
	bw.close();
	}

}
