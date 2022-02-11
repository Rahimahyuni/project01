package project01;

import java.io.File;
import java.util.Scanner;

public class CopyPasteFile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
		System.out.println("Please type source file (including its path)");
		 String source = scanner.nextLine();
		 File sourceFile = new File(source);
		 
		 while(!sourceFile.exists()) {
			 System.out.println("Source file does not exists.");
			 System.out.println("Please type source file (including its path)");
			 source = scanner.nextLine();
			 sourceFile = new File(source);
		 
		 }
			 
		 System.out.println("Please type target file (including its path)");
		 String target = scanner.nextLine();
		 File targetFile = new File(target);
		 
		 while(targetFile.exists()) {
			 System.out.println("Target file already exists.");
			 System.out.println("Please type target file (including its path)");
			 target = scanner.nextLine();
			 targetFile = new File(target);
			 }
			 
		 scanner.close();
			
	}
	
	
	
		 
		 
		 
		 
		
		 
	}

	


