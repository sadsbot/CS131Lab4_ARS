/**
* Scans a text file for Strings, printing each string on a separate line.
*
* @author aross-sermons
* @version 1.0
* CS131; Lab #4
* Spring 2023
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileProcessor {

	private String fileName;
	private int stringLength;
	private ArrayList<String> stringList;
	private Scanner input;
	
	/**
	 * Preferred constructor
	 * @param fileName
	 * @param stringLength
	 */
	public FileProcessor(String fileName, int stringLength) {
		setFileName(fileName);
		setStringLength(stringLength);
	}//end preferred constructor
	
	/**
	 * Reads each String in the specified file. Prints one String per line.
	 * Catches FileNotFoundException and StringTooLongException in method body.
	 */
	public void processFile() {
		try {
			input = new Scanner(new File(fileName));
			String current;
			while(input.hasNext()) {
				current = input.next();
				if(current.length() > stringLength) throw new StringTooLongException("String is too long!");
				else System.out.println(current);
			}
		}catch(FileNotFoundException e) {
			System.out.println("\n" + e);
		}catch(StringTooLongException s) {
			System.out.println("\n" + s);
		}//end try/catch blocks
	}//end processFile

	/**
	 * @return the ArrayList size
	 */
	public int getArrayListSize() {
		return stringList.size();
	}//end getArrayListSize
	
	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}//end getFileName

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}//end setFileName

	/**
	 * @return the stringLength
	 */
	public int getStringLength() {
		return stringLength;
	}//end getStringLength

	/**
	 * @param stringLength the stringLength to set
	 */
	public void setStringLength(int stringLength) {
		if(stringLength < 5)this.stringLength = 5;
		else this.stringLength = stringLength;
	}//end setStringLength
	
}//end class
