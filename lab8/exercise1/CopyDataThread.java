package lab8.exercise1;

import java.io.*;

public class CopyDataThread extends Thread {
	
    public CopyDataThread(FileWriter f1, File f2) throws InterruptedException,IOException  {
    	
    	FileReader fr = new FileReader("f1"); 
    	int x = fr.read( );
        FileWriter fw = new FileWriter(f2); 
        int i = 0;
    	while(x != -1)
    	 {  fw.write((char)x);
    	    i++;
    	    if(i%10 == 0) {
    	       System.out.println("10 characters are copied");
    	       sleep(500);
    	    }
    	 x=fr.read();
    	 
    	 }
	}
}