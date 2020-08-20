package com.amikhailov.conferences.conferenceapp.conference.domain;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class Conference {

    private int id;
    private String name;
    private String venue;
    private ZonedDateTime startDate;
    private ZonedDateTime finishDate;
}
