package com.infy.eventregistration.service;

import java.util.List;

import com.infy.eventregistration.dto.ParticipantDTO;
import com.infy.eventregistration.exception.EventRegistrationException;
import com.infy.eventregistration.repository.EventRepository;
import com.infy.eventregistration.repository.ParticipantRepository;

public class EventServiceImpl implements EventService
{

    private EventRepository eventRepository;

    private ParticipantRepository participantRepository;

    // DO NOT CHANGE METHOD SIGNATURE AND DELETE/COMMENT METHOD
    @Override
    public Integer registerParticipant(ParticipantDTO participantDTO) throws EventRegistrationException
    {
	// your code goes here
	return null;
    }

    // DO NOT CHANGE METHOD SIGNATURE AND DELETE/COMMENT METHOD
    @Override
    public List<ParticipantDTO> getParticipantsByEventVenue(String venue) throws EventRegistrationException
    {
	// your code goes here
	return null;
    }
}
