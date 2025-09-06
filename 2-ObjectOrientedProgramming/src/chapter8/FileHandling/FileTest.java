package chapter8.FileHandling;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {

		try
		{
	File f1= new File("test.txt");
	f1.createNewFile();
		}
		catch(IOException e)
		{
			System.out.println("File problem");
		}
	
	
}}
