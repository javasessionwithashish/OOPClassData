package chapter8.FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BuffFileReaderTest {
	
	public static void main(String[] args) {
		
	File filepath= new File("test.txt");
	
try {	
	
	FileReader fr = new FileReader(filepath);
	
BufferedReader br = new BufferedReader(fr);
String data;

while((data=br.readLine())!=null)
{
	System.out.println(data);
}

}
catch(IOException e)
{
	
}
		
		
		
	}

}
