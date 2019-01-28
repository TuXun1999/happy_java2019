package test_file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class test_file {
	public static void main(String[] args){
		try{
		File test = new File("/homes/lvb/lvb-104/Desktop/number.txt");
		Scanner bi = new Scanner(test);
		
		FileWriter f = new FileWriter("/homes/lvb/lvb-104/Desktop/new_number.txt", false);
		//true: the file is opened for append;
		//false: a new file is created, or it is a "w" method
		BufferedWriter b = new BufferedWriter(f);
		PrintWriter out = new PrintWriter(b);

		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(bi.hasNextInt()){//Numbers have to be divided by " " or "\n", or it will be accepted as something not an integer
			arr.add(bi.nextInt());
			
		}
		for(Object temp: arr){
			out.write(temp.toString());//Write the character into the file
			//If you don't use toString, the integers will be considered as ascii codes
			out.write("\n");
		}
		/*
		 * Or, you can get the size of the array first, and then 
		 * add the elements into the array; 
		 */
		bi.close();
		out.close();
		}
		catch (Exception e){
			System.out.println("File Not Found");
			System.exit(0);
		}
		
		
	}
	

}
