package com.subodh.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws FileNotFoundException ,IOException{
		FileInputStream fis=new FileInputStream("Abc.txt");
		FileOutputStream fos=new FileOutputStream("Bbc.txt");
		int data;
		while((data=fis.read())!=-1) {
			fos.write(data);
		}
		fos.flush();
		System.out.println("Data is copied...");
		fis.close();
		fos.close();
	}
}
