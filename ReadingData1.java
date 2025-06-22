package com.subodh.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingData1 {

	public static void main(String[] args) throws FileNotFoundException ,IOException{
		FileInputStream fis=new FileInputStream("Abc.txt");
		int data;
		while((data=fis.read())!=-1) {
			System.out.println((char)data);
		}
		System.out.println("Data is Saved...");
		fis.close();
	}
}
