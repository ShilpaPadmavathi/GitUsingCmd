package com.ntt.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileStreams {
	
	public static void main(String[] args) {
	
		
		Methods m=new Methods();
		String Statement=m.fileReadAndWrite();
		System.out.println("Written Successfully into the file");
		System.out.println("Info in file is: "+Statement);
		
		int count=m.countVowels();
		System.out.println("Number of vowels is "+count);
		
		  }
	
	
	}


