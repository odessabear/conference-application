package com.amikhailov.conferences.conferenceapp.controllers;

import com.amikhailov.conferences.conferenceapp.ui.model.request.ConferenceDetailsRequestModel;
import com.amikhailov.conferences.conferenceapp.ui.model.response.ConferenceRest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("conferences")
public class ConferenceController {

    @GetMapping
    public String getConference() {
        return "get conference was called";
    }

    @PostMapping
    public ConferenceRest createConference(@RequestBody ConferenceDetailsRequestModel conferenceDetailsRequestBody) {
        return null;
    }

    @PutMapping
    public String updateConference() {
        return "update conference was called";
    }

    @DeleteMapping
    public String deleteConference() {
        return "delete conference was called";
    }

}
