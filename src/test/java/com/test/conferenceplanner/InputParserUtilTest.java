/**
 * 
 */
package com.test.conferenceplanner;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import com.test.conferenceplanner.exceptions.FileFormatException;
import com.test.conferenceplanner.utils.ParserInput;


/**
 * @author Arun Kumar
 */

public class InputParserUtilTest {

	@Test
	public void testParseInputIntoTalks() {
		Talk t1 = new Talk("Testplan", 10);
		Talk t2 = new Talk("Textexecution", 10);
		
		ArrayList<Talk> talkList = new ArrayList<Talk>(2);
		talkList.add(t1);
		talkList.add(t2);
		
		try {
			assertEquals(talkList.size(), ParserInput.parseFile("test_small.input").size());
		} catch (FileFormatException e) {
			e.printStackTrace();
		}
	}

}
