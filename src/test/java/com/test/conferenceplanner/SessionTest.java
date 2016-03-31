/**
 * 
 */
package com.test.conferenceplanner;

import static org.junit.Assert.*;

import org.junit.Test;

import com.test.conferenceplanner.utils.DateTimeFormat;

/**
 * @author Arun Kumar
 *
 */
public class SessionTest {

	/**
	 */
	@Test
	public void testSetTalk() {
		Talk t = new Talk("Test", 10);
		Session s = new Session();
		s.setTalk(t);
		s.setStartTime(DateTimeFormat.generateTime(10, 0));
		assertEquals(t, s.getTalk());
	}

	/**
	 */
	@Test
	public void testSetStartTime() {
		Talk t = new Talk("Test", 10);
		Session s = new Session(t, DateTimeFormat.generateTime(9, 0));
		s.setStartTime(DateTimeFormat.generateTime(10, 0));
		assertEquals(DateTimeFormat.generateTime(10, 0), DateTimeFormat.generateTime(10, 0));
	}

	/**
	 */
	@Test
	public void testGetStartTime() {
		Talk t = new Talk("Test Talk", 10);
		Session s = new Session(t, DateTimeFormat.generateTime(9, 0));
		assertEquals(DateTimeFormat.generateTime(9, 0), s.getStartTime());
	}

	/**
	 */
	@Test
	public void testGetTalk() {
		Talk t = new Talk("Test", 10);
		Session s = new Session(t, DateTimeFormat.generateTime(9, 0));
		assertEquals(t, s.getTalk());
	}

}
