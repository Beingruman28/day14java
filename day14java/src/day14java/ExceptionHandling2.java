package day14java;

import java.io.*;

public class ExceptionHandling2 {

	  public static void findFile() {

	       try {
			File newFile = new File("test.txt");
			FileInputStream stream = new FileInputStream(newFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }

	  public static void main(String[] args) {
	    System.out.println("Print the exception");
	  }
	}

