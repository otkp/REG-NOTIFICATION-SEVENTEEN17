package org.epragati.notification.service;

import java.util.Map;
/**
 * AlertsService  used to  send  email and phone or any other notifications..
 * 
 * @author naga.pulaparthi
 *
 */
public interface AlertsService {
	
	/**
	 * 
	 * @param templateId: message template Id should matched to primary key of NotificationTemplate Entity.
	 * is used to get  message data from database.
	 * 
	 * 
	 * @param messageParams(key,value): it's  Used replace message word to dynamic content like @@User@@ : User Name
	 */
	
	void sendNotifications(Long templateId,Map<String,String> messageParams);
}
