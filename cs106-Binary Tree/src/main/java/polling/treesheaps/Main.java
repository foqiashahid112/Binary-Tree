package polling.treesheaps;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Scanner;

import com.opencsv.CSVReaderHeaderAware;

/**
 * The main driver program for Lab 5
 *This program tests LinkedBinary Tree class and takes in arguments to read files and create a binary tree that 
 * stores candidate information. Finally, it outputs candidate date is pre,post and in order. 
 *
 *
 * @author: Foqia Shahid
 * @version: April 6, 2020
 */

public class Main {
	
    public static void main(String[] args) {
    	
//    	// TODO: first create tests for your LinkedBinaryTree class (in a separate method below).
//    	BinaryTree<Integer> intTree = new LinkedBinaryTree<Integer>();
//    	intTree.insert(8);
//    	intTree.insert(11);
//    	intTree.insert(5);
//    	intTree.insert(17);
//    	intTree.insert(1);
//    	intTree.insert(9);
//    	intTree.insert(3);
//    	intTree.insert(3);
//    	System.out.println(intTree);
//  	
//    	/*            8
//    	 *        5      11
//    	 *     1       9    17
//    	 *       3
//    	 */
//    	
//
//	BinaryTree<Character> letterTree = new LinkedBinaryTree<Character>();
//	letterTree.insert('A');
//	letterTree.insert('C');
//	letterTree.insert('G');
//	letterTree.insert('B');
//	letterTree.insert('D');
//	letterTree.insert('G'); // inserting again, should replace
//	letterTree.insert('F');
//	letterTree.insert('E');
//	letterTree.insert('H');
//	letterTree.insert('I');
//	System.out.println("size:" + letterTree.size());
//	System.out.println(letterTree);
    	
        // TODO: then read in the polling data from the given files and create a tree of candidates.

		Scanner input = new Scanner(new StringReader(args[0]));
		BinaryTree<PollingData>  binaryTree= new LinkedBinaryTree<PollingData>();
		for (int i = 0; i < args.length; i++) {
		try {
		String filePath = args[i];
		CSVReaderHeaderAware reader = new CSVReaderHeaderAware(new FileReader(filePath));
		ArrayList<String[]> myEntries = new ArrayList<String[]>(reader.readAll());
		for(String[] row : myEntries) {
			PollingData candidate = new PollingData(row); 
			binaryTree.insert(candidate);
			}
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}	
		}
		System.out.println(binaryTree);		
	}



}
