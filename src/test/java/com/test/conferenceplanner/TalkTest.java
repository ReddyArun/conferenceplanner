/**
 * 
 */
package com.test.conferenceplanner;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;


/**
 * @author Arun Kumar
 *
 */
public class TalkTest {

	/**
	 */
	@Test
	public void testSetTitle() {
		Talk t = new Talk("Test", 10);
		t.setTitle("Test Title");
		assertEquals("Test Title", t.getTitle());
	}

	/**
	 */
	@Test
	public void testSetMinuteDuration() {
		Talk t = new Talk("Test Title", 10);
		t.setMinuteDuration(20);
		assertEquals(20, t.getMinuteDuration());
	}

	/**
	 */
	@Test
	public void testGetTitle() {
		Talk t = new Talk("Test Title", 10);
		assertEquals("Test Title", t.getTitle());
	}

	/**
	 */
	@Test
	public void testGetMinuteDuration() {
		Talk t = new Talk("Test Title", 10);
		assertEquals(10, t.getMinuteDuration());
	}

	/**
	 */
	@Test
	public void testCompareTo() {
		// Create one talk with minute duration = 10.
		Talk t1 = new Talk("T1", 10);
		
		// Create one talk with minute duration = 20.
		Talk t2 = new Talk("T2", 20);
		
		// Put them into an array.
		ArrayList<Talk> talkList = new ArrayList<Talk>(2);
		talkList.add(t1);
		talkList.add(t2);
		
		// Sort it.
		Collections.sort(talkList);
		
		// Get the first item from the sorted list.
		assertEquals(20, talkList.get(0).getMinuteDuration());
	}

}
