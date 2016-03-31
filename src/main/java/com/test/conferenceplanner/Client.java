package com.test.conferenceplanner;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.test.conferenceplanner.exceptions.FileFormatException;

public class Client {

	final static Logger logger = Logger.getLogger(Client.class);

	// The default filename, used if no filename is provided by the user.
	private static final String DEFAULT_FILE = "test.input";

	// The name file from which data is to be read.
	private static String inputFileName;

	private static Scanner s;

	/**
	 * Takes a String argument identifying the file to be opened. If the String
	 * is null, a filename is requested from Standard.in. If the user enters an
	 * empty String, the default filename is used.
	 * 
	 * @param args
	 * @throws IOException
	 * @throws FileFormatException
	 */

	public static void main(String[] args) throws FileFormatException, IOException {

		logger.info("WelCome to Conference Planner Program");
		// Initial parameter will contain filename, if one exist, so check this
		// first.
		if (args.length == 0) {
			// Filename not supplied by command line, get from user.
			inputFileName = getInputFileName();
		} else {
			inputFileName = args[0];
		}

		// Start the SessionOrganizer with the filename specified.
		try {
			logger.info("Input file name : " + inputFileName);
			new SessionOrganizer(inputFileName);
		} catch (FileNotFoundException e) {
			logger.error("Fatal error: " + e.getMessage() + "\nProgram terminated unsuccessfully.");
		}

	}

	private static String getInputFileName() {

		s = new Scanner(System.in);
		while (true) {
			System.out.println("Enter input file name: ");
			String input = s.nextLine();
			if (input.isEmpty()) {
				input = DEFAULT_FILE;
				logger.info("No input from user, hence system is setting default input file name : " + input);
			}
			return input;
		}
	}

}
