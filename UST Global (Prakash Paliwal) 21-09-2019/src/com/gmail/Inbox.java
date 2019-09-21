package com.gmail;

public class Inbox {

	private int messageID = 0;
	private int userId;
	private String message;

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
		this.messageID++;
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
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
