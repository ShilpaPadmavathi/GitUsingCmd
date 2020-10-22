package com.ntt.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialEx {
	
	public static void main(String[] args) {
		Student s = new Student(1221, "Shilpa", 98.36,15);  
          
        // Serialization  
        try
        {    
            //Saving of object in a file 
            FileOutputStream file = new FileOutputStream("C:\\Users\\shilpa gorantla\\Desktop\\Java Ntt\\New folder\\shilpa.txt"); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
              
            // Method for serialization of object 
            out.writeObject(s); 
              
            out.close(); 
            file.close(); 
              
            System.out.println("Object has been serialized");
            System.out.println("Before Serialization: "+s.StudentId+"\n"+s.studentName+"\n"+s.marks+"\n"+s.age);
  
        } 
          
        catch(Exception ex) 
        { 
            System.out.println("Exception is caught"); 
        } 
  
  
        //Student s1 = null; 
        try
        {     
            FileInputStream file = new FileInputStream("C:\\Users\\shilpa gorantla\\Desktop\\Java Ntt\\New folder\\shilpa.txt"); 
            ObjectInputStream in = new ObjectInputStream(file); 
            Student  s1 = (Student)in.readObject(); 
              
            in.close(); 
            file.close(); 
              
            System.out.println("Object has been deserialized "); 
            System.out.println(s1.StudentId); 
            System.out.println(s1.studentName);
            System.out.println(s1.age);
            System.out.println(s1.marks);
        } 
          
        catch(Exception e) 
        { 
            System.out.println("Exception is caught"); 
        } 
  
    } 
	}


