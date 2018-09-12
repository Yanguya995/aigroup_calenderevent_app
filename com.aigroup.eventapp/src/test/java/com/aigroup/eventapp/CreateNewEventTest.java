package com.aigroup.eventapp;

import static org.junit.Assert.assertNull;

import java.io.File;

import org.junit.Test;

import com.aigroup.eventapp.Post.CalenderEvent;
import com.aigroup.eventapp.Post.CreateNewEvent;

public class CreateNewEventTest {

	CalenderEvent event;

	@Test
	public void returnNullResponse() {

		CreateNewEvent myCreateNewEvent = new CreateNewEvent();
		event = myCreateNewEvent.createNewEvent(new File(""));
		assertNull(event);
	}
}