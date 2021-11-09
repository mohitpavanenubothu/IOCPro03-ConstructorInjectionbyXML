package com.springcore.ci.bean;

import java.util.Date;

public class WishMessageGenerator {

	// Instance Variable
	private Date date;

	public WishMessageGenerator(Date date) {// Local Variable
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
		this.date = date;
	}

	// Business Logic
	public String getMsg(String user) {
		System.out.println("WishMessageGenerator.getMsg()");
		int hour = date.getHours();
		if (hour < 12)
			return "Good Morning " + user;
		else if (hour < 16)
			return "Good Afternoon " + user;
		else if (hour < 20)
			return "Good Evening " + user;
		else
			return "Good Night " + user;
	}

}
