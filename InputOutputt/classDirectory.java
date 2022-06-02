package InputOutputt;

import java.io.File;

public class classDirectory {

		public static void main(String[] args) {

			// This program will print all the file and subdirectories which are present in
			// directory 

			File directory = new File("C:\\Rays\\samplee");// here is the path of dierctory 
			String[] list = directory.list();
			
			  for(int i=0; i<list.length; i++) 
			  { 
				  System.out.println((i+1)+ ":"+list[i]);
			  }
			  	 
		}

	}
	

