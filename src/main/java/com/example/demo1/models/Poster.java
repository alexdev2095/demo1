package com.example.demo1.models;

import java.util.Date;

public class Poster {
    private int id;
    private String title;
    private String description;
    private String urlImag;
    private Date fecha;

    public Poster() {
    }

    public Poster(int id, String title, String description, String urlImag, Date fecha) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.urlImag = urlImag;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlImag() {
        return urlImag;
    }

    public void setUrlImag(String urlImag) {
        this.urlImag = urlImag;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
