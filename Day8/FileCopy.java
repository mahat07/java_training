package com.celcom.day8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\Inamanamelluri_V\\abc.txt");
		FileWriter fw = new FileWriter("C:\\Users\\Inamanamelluri_V\\copiedfile.txt");
		int ch = 0;
		while ((ch = fr.read()) != -1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
		System.out.println("File Copied!!!");
	}

}
