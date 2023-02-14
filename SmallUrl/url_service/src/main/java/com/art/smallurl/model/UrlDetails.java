package com.art.smallurl.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Builder
@AllArgsConstructor
@Getter
public class UrlDetails {
    private String url;
    private String description;

    private String alias;

    private Date expire;

}
