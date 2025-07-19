package com.factory.method.design.pattern;

public class NotificationManager  {
	
	private static NotificationService notificationService;
	
	private NotificationManager() {
		
	}
	
	public static NotificationService getInstance(String type) {
		
		
		if(type.equalsIgnoreCase(NotificationType.SMS_TYPE)) {
			
			notificationService = new SMSNotificationService();
			
		}else if(type.equalsIgnoreCase(NotificationType.EMAIL_TYPE)) {
			
			notificationService = new EmailNotificationService();
			
		}else if(type.equalsIgnoreCase(NotificationType.PUSH_TYPE)) {
			
			notificationService = new PushNotificationService();
		}
		
		return notificationService;
		
	}
	
	

}
