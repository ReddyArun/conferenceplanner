package com.test.conferenceplanner;

import java.util.Date;

/**
 * The session class gives a start time to a presentation . 
 * 
 * @author Arun Kumar
 */

public class Session {

	private Talk talk;
	private Date startTime;
	
	public Session(Talk talk, Date startTime) {
		this.talk = talk;
		this.startTime = startTime;
	}
	
	public Session() {
	}

	public void setTalk(Talk talk) {
		this.talk = talk;
	}
	
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	
	public Date getStartTime() {
		return this.startTime;
	}
	
	public Talk getTalk() {
		return this.talk;
	}
}
