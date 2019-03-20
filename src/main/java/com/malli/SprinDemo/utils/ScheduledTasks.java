package com.malli.SprinDemo.utils;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

	 @Scheduled(fixedRate = 5000)
	public void getCurrentDate()
	{
		 System.out.println("Date is : "+new Date());
		
	}
}
