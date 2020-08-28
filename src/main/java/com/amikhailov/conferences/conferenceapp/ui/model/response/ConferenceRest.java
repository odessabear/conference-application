package com.amikhailov.conferences.conferenceapp.ui.model.response;

import lombok.Data;

import java.time.ZonedDateTime;
import java.util.UUID;

@Data
public class ConferenceRest {

    private String id = UUID.randomUUID().toString();
    private String name;
    private String venue;
    private ZonedDateTime startDate;
    private ZonedDateTime finishDate;

}
