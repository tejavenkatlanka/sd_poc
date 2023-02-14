package com.art.smallurl.controller;

import com.art.smallurl.model.ShortUrl;
import com.art.smallurl.model.UrlDetails;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController("/api/v1/small-url")
public class SmallUrlController {

    @PostMapping(name = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ShortUrl createSortUrl(@RequestBody UrlDetails urlDetails) {
        return null;
    }

}