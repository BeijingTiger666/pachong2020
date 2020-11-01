package com.ming.pachong2020.entity;

import java.util.Date;

public class Movieanalysis {
    private Integer movieId;

    private Integer detailId;

    private String movieName;

    private String sname;

    private String namehash;

    private String movieType;

    private String movieUrl;

    private Date collectingTime;

    public Movieanalysis(Integer movieId, Integer detailId, String movieName, String sname, String namehash, String movieType, String movieUrl, Date collectingTime) {
        this.movieId = movieId;
        this.detailId = detailId;
        this.movieName = movieName;
        this.sname = sname;
        this.namehash = namehash;
        this.movieType = movieType;
        this.movieUrl = movieUrl;
        this.collectingTime = collectingTime;
    }

    public Movieanalysis() {
        super();
    }

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

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getNamehash() {
        return namehash;
    }

    public void setNamehash(String namehash) {
        this.namehash = namehash == null ? null : namehash.trim();
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
}