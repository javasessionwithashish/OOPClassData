package chapter8.FileHandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	
	public static void main(String[] args) {
		
		File filepath = new File("test.txt");
		try
		{
FileWriter writer = new FileWriter(filepath);
writer.write("Hello World!"); //Character Stream
writer.close();
System.out.println("The file has been written");
		}
		catch(IOException e)
		{
			
		}
		
		
		
	}

}
