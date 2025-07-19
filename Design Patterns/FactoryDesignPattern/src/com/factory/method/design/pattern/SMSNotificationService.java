package com.factory.method.design.pattern;

public class SMSNotificationService implements NotificationService {

	@Override
	public void sendNotification(String subject) {
		
		System.out.println("Send SMS to : " + subject);
		
	}

}
