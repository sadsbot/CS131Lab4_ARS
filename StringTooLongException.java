/**
* Exception to be used when a String exceeding a specified length is scanned.
*
* @author aross-sermons
* @version 1.0
* CS131; Lab #4
* Spring 2023
*/

@SuppressWarnings("serial")
public class StringTooLongException extends Exception{
	/**
	 * Preferred constructor with a message parameter.
	 * @param message
	 */
	public StringTooLongException(String message) {
		super(message);
	}//end preferred constructor
}//end StringTooLongException.java
