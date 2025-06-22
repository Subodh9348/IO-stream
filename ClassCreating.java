package com.subodh.iostream;

import java.io.File;
import java.io.IOException;

public class ClassCreating {

	public static void main(String[] args) throws IOException {
		File f1=new File("xyz.txt");
		System.out.println(f1.exists());
		System.out.println(f1.createNewFile());
		System.out.println("..............................................");
		File f2=new File("abc");
		System.out.println(f2.exists());
		System.out.println(f2.mkdir());
		System.out.println("..............................................");
		File f3=new File("abc","a.txt");
		System.out.println(f3.exists());
		System.out.println(f3.createNewFile());
		System.out.println("..............................................");
		File f4=new File("abc","def");
		//System.out.println(f1.exists());
		System.out.println(f4.mkdir());
		System.out.println("..............................................");
		File f5=new File("mno","stv");
		//System.out.println(f1.exists());
		f5.mkdirs();
		//System.out.println("..............................................");





	}

}
