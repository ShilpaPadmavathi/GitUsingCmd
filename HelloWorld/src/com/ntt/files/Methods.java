package com.ntt.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Methods {
	
	static String fileReadAndWrite(){
		String s = null;
		try {
		      FileWriter myWriter = new FileWriter("C:\\Users\\shilpa gorantla\\Desktop\\Java Ntt\\New folder\\abc.txt");
		      myWriter.write("Hai Shilpa How Are You");
		      myWriter.close();
		      //System.out.println("Written Successfully into the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		     // e.printStackTrace();
		    }
		
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\shilpa gorantla\\Desktop\\Java Ntt\\New folder\\abc.txt");
			FileReader fir=new FileReader("C:\\Users\\shilpa gorantla\\Desktop\\Java Ntt\\New folder\\abc.txt");
					
			Scanner scan=new Scanner(fir);
			//System.out.println(fis.read()); //printing Ascii Value of First letter of my file
			
			
			//char[] character;
			while(scan.hasNextLine()) {
				//System.out.println(scan.nextLine());
				s=scan.nextLine();
				//System.out.println(s);
				return s;
			}
	} catch (FileNotFoundException e) {
		System.out.println("File not found");
		e.printStackTrace();
	}
		return s;
	
	
	  }
	
	
	int countVowels() {
		String s=fileReadAndWrite();
		int count=0;
		for(int i=0;i<s.length();i++) {
			
			char[] character=new char[s.length()];
			character[i]=s.charAt(i);
		
			//System.out.println(character[i]);
			if(character[i]=='a'||character[i]=='e'||character[i]=='i'||character[i]=='o'||character[i]=='u') {
				count++;
			}
			else if(character[i]=='A'||character[i]=='E'||character[i]=='I'||character[i]=='O'||character[i]=='U')
				count++;
			
		}

		return count;
		
	}

}
