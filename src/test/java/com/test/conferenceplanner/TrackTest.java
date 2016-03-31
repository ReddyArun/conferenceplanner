package com.test.conferenceplanner;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import com.test.conferenceplanner.utils.DateTimeFormat;


/**
 * @author Arun Kumar
 *
 */
public class TrackTest {

	@Test
	public void testAddSessions() {
		Track track = new Track();
		Session session1 = new Session(new Talk("Test 1", 10), DateTimeFormat.generateTime(9, 0));
		Session session2 = new Session(new Talk("Test 2", 10), DateTimeFormat.generateTime(9, 10));
		Session session3 = new Session(new Talk("Test 3", 10), DateTimeFormat.generateTime(9, 20));
		
		track.addSession(session1);
		track.addSession(session2);
		track.addSession(session3);
		assertEquals(session1, track.getSession(0));
	}
	
	@Test
	public void testGetSessions() {
		Track track = new Track();
		Session session1 = new Session(new Talk("Test 1", 10), DateTimeFormat.generateTime(9, 0));
		Session session2 = new Session(new Talk("Test 2", 10), DateTimeFormat.generateTime(9, 10));
		Session session3 = new Session(new Talk("Test 3", 10), DateTimeFormat.generateTime(9, 20));
		
		track.addSession(session1);
		track.addSession(session2);
		track.addSession(session3);
		
		ArrayList<Session> sessionsList = new ArrayList<Session>(3);
		sessionsList.add(session1);
		sessionsList.add(session2);
		sessionsList.add(session3);
		
		assertEquals(sessionsList, track.getSessions());
	}

}
