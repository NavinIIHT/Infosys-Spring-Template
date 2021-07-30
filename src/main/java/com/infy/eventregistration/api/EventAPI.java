package com.infy.eventregistration.api;

import java.util.List;

import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;

import com.infy.eventregistration.dto.ParticipantDTO;
import com.infy.eventregistration.exception.EventRegistrationException;
import com.infy.eventregistration.service.EventService;

public class EventAPI
{
    private EventService eventService;

    private Environment environment;

    // DO NOT CHANGE METHOD SIGNATURE AND DELETE/COMMENT METHOD
    public ResponseEntity<String> registerParticipant(ParticipantDTO participantDTO) throws EventRegistrationException
    {
	// your code goes here
	return null;
    }

    // DO NOT CHANGE METHOD SIGNATURE AND DELETE/COMMENT METHOD
    public ResponseEntity<List<ParticipantDTO>> getParticipantsByEventVenue(String venue) throws EventRegistrationException
    {
	// your code goes here
	return null;
    }

}
