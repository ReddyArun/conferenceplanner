package com.test.conferenceplanner.exceptions;

/**
 * Custom exception
 * 
 * @author Arun Kumar
 *
 */
public class FileFormatException extends Exception {
	private static final long serialVersionUID = 4944813673385992032L;
	/**
	 * Exception class to handle wrong string format in the text file.
	 */

	private String errorDescription;
	private int lineNumber;

	/**
	 * @param errorDescription
	 * @param lineNumber
	 */
	public FileFormatException(String errorDescription, int lineNumber) {
		this.errorDescription = errorDescription;
		this.lineNumber = lineNumber;
	}

	/**
	 * @return errorDescription
	 */
	public String getErrorDescription() {
		return errorDescription;
	}

	/**
	 * @return lineNumber
	 */
	public int getLineNumber() {
		return lineNumber;
	}
}
