package com.factory.method.design.pattern;

import java.util.Optional;

/**

<h1> Factory Method Design Pattern :</h1> <span>Define an interface to create an object but the subclass will decide which class instantiate </span>

@author Deepak Soni
*/
public class FactoryMethodDesignPatternMain {

	public static void main(String[] args) {

		Optional<NotificationService> notificationServiceOptional = Optional
				.ofNullable(NotificationManager.getInstance(NotificationType.FACK_TYPE));

		notificationServiceOptional.ifPresentOrElse(
				p -> p.sendNotification("daksh@gmail.com"),
				() -> System.out.println("Invalid Entry"));
		
		notificationServiceOptional = Optional
				.ofNullable(NotificationManager.getInstance(NotificationType.EMAIL_TYPE));

		notificationServiceOptional.ifPresentOrElse(
				p -> p.sendNotification("daksh@gmail.com"),
				() -> System.out.println("Invalid Entry"));
		
		

	}

}
