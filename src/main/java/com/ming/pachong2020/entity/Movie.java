package com.ming.pachong2020.entity;

import java.util.Date;

public class Movie {
    private Integer movieId;

    private Integer detailId;

    private String movieName;

    private String movieType;

    private String movieUrl;

    private Date collectingTime;

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName == null ? null : movieName.trim();
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType == null ? null : movieType.trim();
    }

    public String getMovieUrl() {
        return movieUrl;
    }

    public void setMovieUrl(String movieUrl) {
        this.movieUrl = movieUrl == null ? null : movieUrl.trim();
    }

    public Date getCollectingTime() {
        return collectingTime;
    }

    public void setCollectingTime(Date collectingTime) {
        this.collectingTime = collectingTime;
    }

    public Movie(Integer movieId, Integer detailId, String movieName, String movieType, String movieUrl, Date collectingTime) {
        this.movieId = movieId;
        this.detailId = detailId;
        this.movieName = movieName;
        this.movieType = movieType;
        this.movieUrl = movieUrl;
        this.collectingTime = collectingTime;
    }

    public Movie() {
    }
}