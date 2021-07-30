package com.infy.eventregistration.dto;

import java.time.LocalDate;

public class ParticipantDTO
{

    private Integer participantId;

    private String name;

    private String emailId;

    private String gender;

    private LocalDate registrationDate;

    private EventDTO eventDTO;

    public Integer getParticipantId()
    {
	return participantId;
    }

    public void setParticipantId(Integer participantId)
    {
	this.participantId = participantId;
    }

    public String getName()
    {
	return name;
    }

    public void setName(String name)
    {
	this.name = name;
    }

    public String getEmailId()
    {
	return emailId;
    }

    public void setEmailId(String emailId)
    {
	this.emailId = emailId;
    }

    public String getGender()
    {
	return gender;
    }

    public void setGender(String gender)
    {
	this.gender = gender;
    }

    public LocalDate getRegistrationDate()
    {
	return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate)
    {
	this.registrationDate = registrationDate;
    }

    public EventDTO getEventDTO()
    {
	return eventDTO;
    }

    public void setEventDTO(EventDTO event)
    {
	this.eventDTO = event;
    }

}
