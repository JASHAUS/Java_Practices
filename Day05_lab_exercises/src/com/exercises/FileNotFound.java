package com.exercises;
/*
Handling a checked exception by opening a file
Write a  code opens a text file and writes its content to the standard output. What happens if the file doesn’t exist?*/


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFound {
	
		public static void main(String[] args) {
			File file = new File("C:/Java.txt");
			FileInputStream fis = null;
			try{
				fis = new FileInputStream(file);
				while (fis.read()!=-1){
					System.out.println(fis.read());
				}
			}catch (FileNotFoundException e){
				System.out.println("The File is not found");
			}catch (IOException e){
				e.printStackTrace();
			}
		}
	}

