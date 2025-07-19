package com.factory.method.design.pattern;

public class PushNotificationService implements NotificationService {

	@Override
	public void sendNotification(String subject) {
		
		System.out.println("Send push notification to : " + subject);
		
	}

}
