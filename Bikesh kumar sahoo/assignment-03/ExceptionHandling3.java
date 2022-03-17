package com.exception;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ExceptionHandling3 {
	
	

	public static void main(String[] args) {
		File f = new File("d:\\a.txt");
		FileReader fr = null;
		
		try {
			FileReader fr = new FileReader(f); 
			while(fr.read()!=-1) {
				
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			fr.close();
		}
		
		// TODO Auto-generated method stub

	}

}
