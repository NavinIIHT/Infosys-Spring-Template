package com.infy.eventregistration.service;

import java.util.List;

import com.infy.eventregistration.dto.ParticipantDTO;
import com.infy.eventregistration.exception.EventRegistrationException;

public interface EventService {
	Integer registerParticipant(ParticipantDTO participantDTO) throws EventRegistrationException;
	List<ParticipantDTO> getParticipantsByEventVenue(String venue) throws EventRegistrationException;
}
