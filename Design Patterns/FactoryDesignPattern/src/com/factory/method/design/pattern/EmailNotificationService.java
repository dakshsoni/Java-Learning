package com.factory.method.design.pattern;

public class EmailNotificationService implements NotificationService {

	@Override
	public void sendNotification(String subject) {
		
		System.out.println("Send email to : " + subject);
		
	}

}
