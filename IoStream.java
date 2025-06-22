package com.subodh.iostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoStream {

	public static void main(String[] args) throws FileNotFoundException ,IOException{
		FileOutputStream fos=new FileOutputStream("Abc.txt");
		fos.write(97);
		fos.flush();
		fos.close();
		System.out.println("Data is Saved...");

	}

}
