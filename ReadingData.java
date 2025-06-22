package com.subodh.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
import java.io.IOException;

public class ReadingData {

		public static void main(String[] args) throws FileNotFoundException ,IOException{
			FileInputStream fis=new FileInputStream("Abc.txt");
			int data1=fis.read();
			System.out.println(data1);
			System.out.println("Data is Saved...");
			fis.close();

		}

	}


