package InputOutputt;

import java.io.File;
import java.sql.Date;

public class Input_Output {
public static void main(String[] args) {
	
	File f = new File("C:\\Users\\Gehlot\\OneDrive\\Pictures\\rayssss.jpg");
	//File m = new File("C:\\Users\\Gehlot\\OneDrive\\Pictures\\rayssss.jpg");
	if(f.exists());{
	System.out.println("Name "+ f.getName());
	System.out.println("Absolute path : "+f.getAbsolutePath());
	System.out.println("Is writable : " +f.canWrite());
	System.out.println("Is readable : " +f.canRead());
	System.out.println("Is file : " +f.isFile());
	System.out.println("Is directory : " +f.isDirectory());
	System.out.println("Last modified at : " +new Date(f.lastModified()));
	System.out.println("Length : " +f.length()+"bytes long");
	
	}
	System.out.println();
 //f.delete();
   // f.renameTo(m);
	
	//MORE METHODS
}	
	
}

