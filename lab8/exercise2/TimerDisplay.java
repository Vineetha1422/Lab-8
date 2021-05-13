package lab8.exercise2;

import java.io.*;

import lab8.exercise1.CopyDataThread;

public class TimerDisplay {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		File f = new File("File1");
		f.createNewFile();
		FileWriter fw = new FileWriter(f);
		fw.write("Hello!");
		File f2 = new File("File2");
		
		 CopyDataThread obj = new CopyDataThread(fw,f2);
		 
	}

}
