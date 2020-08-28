package com.amikhailov.conferences.conferenceapp.conference.services;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class ConferenceDto {

    String id;
    String name;
    String venue;
    ZonedDateTime startDate;
    ZonedDateTime finishDate;

}
