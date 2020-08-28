package com.amikhailov.conferences.conferenceapp.conference.domain;

import lombok.Data;

import java.time.ZonedDateTime;
import java.util.UUID;

@Data
public class Conference {

    private String id = UUID.randomUUID().toString();
    private String name;
    private String venue;
    private ZonedDateTime startDate;
    private ZonedDateTime finishDate;
}
