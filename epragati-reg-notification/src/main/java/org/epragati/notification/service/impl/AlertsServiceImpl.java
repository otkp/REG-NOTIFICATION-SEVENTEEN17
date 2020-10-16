/*package org.epragati.notification.service.impl;

import java.util.List;
import java.util.Map;

import org.epragati.dao.notification.NotificationConfigurationDetailsDAO;
import org.epragati.enity.notification.NotificationConfigurationDetailsEntity;
import org.epragati.notification.service.AlertsService;
import org.springframework.beans.factory.annotation.Autowired;

public class AlertsServiceImpl implements AlertsService {

	@Autowired
	private NotificationConfigurationDetailsDAO notificationConfigurationDetailsDAO;
	
	@Override
	public void sendNotifications(Long templateId, Map<String, String> messageParams) {

		List<NotificationConfigurationDetailsEntity> notificationConfigurationDetailsEntity 
		=notificationConfigurationDetailsDAO.findByTemplateId(templateId);
		
		notificationConfigurationDetailsEntity.stream().forEach(entity->{
			
			messageParams.entrySet().stream().forEach(key1->{
				//TODO:need to implement alerts logic
			});
		});

	}

}
*/