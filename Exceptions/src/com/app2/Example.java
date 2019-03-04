package com.app2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example{
public static void main(String[] args) throws IOException {
	FileWriter fw = null;
	FileReader fr=null;
try {
	fw=new FileWriter(new File("d:/employee.txt"));
	fw.write("prasanth");
	fw.flush();
	fr=new FileReader("d:/employee.txt");
	int ch = fr.read();
	System.out.println(ch);
} catch (IOException e) {
	e.printStackTrace();
}
finally{
	fw.close();
}
}
} 
