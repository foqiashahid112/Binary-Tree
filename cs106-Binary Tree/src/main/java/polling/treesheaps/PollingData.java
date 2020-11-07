package polling.treesheaps;

import java.io.FileReader;
import java.util.ArrayList;

import com.opencsv.CSVReaderHeaderAware;
/**
 * The Class that holds information on a single candidate and cane be used tot compare last Names
 * lexicographically
 *
 * @author: Foqia Shahid
 * @version: April 6, 2020
 */


public class PollingData implements Comparable<PollingData>{
	private String lastName;
	private String fullName;
	private double percentage;
	
	/**
	 * Constructor that takes a string array whose indices correspond to column order of csv file
	 * @param pollingData String Array
	 */
	public PollingData(String [] pollingData) {
		lastName = pollingData[0];
		fullName = pollingData[1];
		percentage = Double.parseDouble(pollingData[2]);
	}

	
	/**
	 * to String method
	 * @return String that writes Name and Percentage 
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(this.fullName);
		sb.append(":");
		sb.append(this.percentage);
		return sb.toString();
	}

	/**
	 * compareTo method that compares the last names of candidates lexicographically
	 * @param newData PollingData 
	 * @return int 0 if equal, 1 if less than and -1 if name in newData is greater than given name
	 */
	public int compareTo(PollingData newData) {  //Sanders.compareTo(anotherCandidate).
		if( ( (this.lastName).compareTo(newData.lastName) ) > 0 ) {  //this.lastName > newData.lastName
			return 1;
		}
		else if( ( (this.lastName).compareTo(newData.lastName) ) < 0  ){ //this.lastName < newData.lastName
			return -1;
		}
		else { //equal
			return 0;
		}
	}




}
