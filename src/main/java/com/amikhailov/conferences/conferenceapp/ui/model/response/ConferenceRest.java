package com.amikhailov.conferences.conferenceapp.ui.model.response;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class ConferenceRest {

    private String conferencePublicId;
    private String name;
    private String venue;
    private ZonedDateTime startDate;
    private ZonedDateTime finishDate;

}
