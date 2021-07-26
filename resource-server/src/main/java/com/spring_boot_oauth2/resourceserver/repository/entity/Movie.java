package com.spring_boot_oauth2.resourceserver.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Movie implements Serializable {

    private String movieId;

    private String title;

    private String plot;

    private String genre;

    private Integer releaseYear;

    private Double rating;

    private Integer vote;

    private String poster;

    private String imdbId;
}
