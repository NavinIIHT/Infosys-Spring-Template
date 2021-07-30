package com.infy.eventregistration;

import com.infy.eventregistration.repository.EventRepository;
import com.infy.eventregistration.repository.ParticipantRepository;
import com.infy.eventregistration.service.EventService;
import com.infy.eventregistration.service.EventServiceImpl;

public class EventRegistrationApplicationTests
{

    private EventRepository eventRepository;

    private ParticipantRepository participantRepository;

    private EventService eventService = new EventServiceImpl();

    // DO NOT CHANGE METHOD SIGNATURE AND DELETE/COMMENT METHOD
    public void getParticipantsByEventVenueNoParticipantsFoundTest()
    {
	// your code goes here
    }

    // DO NOT CHANGE METHOD SIGNATURE AND DELETE/COMMENT METHOD
    public void registerParticipantNoEventFoundTest()
    {
	// your code goes here
    }
}
