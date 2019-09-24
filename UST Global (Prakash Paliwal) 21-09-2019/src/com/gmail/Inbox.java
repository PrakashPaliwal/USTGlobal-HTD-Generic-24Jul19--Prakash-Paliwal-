package com.gmail;

import java.util.Arrays;

public class Inbox {
	static int inIdGen = 0;
	private int messageID;
	private int userId;
	private String message[] = new String[10];

	static public Inbox createObj() {
		Inbox i = new Inbox();
		return i;
	}

	/**
	 * @return the messageID
	 */
	public int getMessageID() {
		return messageID;
	}

	/**
	 * @param messageID the messageID to set
	 */
	public void setMessageID(int messageID) {
		this.messageID = this.inIdGen;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the message
	 */
	public String[] getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "Inbox [messageID=" + messageID + ", userId=" + userId + ", message=" + Arrays.toString(message) + "]";
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message[this.inIdGen] = message;
		this.inIdGen++;
	}

}
