package com.ghozay19.arsitekturandro.data.db.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class Movie {
    @Id
    private Long id;
    @Property
    private String tittle;
    @Property
    private String poster;
    @Property
    private String synopsis;
    @Property
    private String rating;
    @Property
    private String releaseDate;
    @Generated(hash = 1613852163)
    public Movie(Long id, String tittle, String poster, String synopsis,
            String rating, String releaseDate) {
        this.id = id;
        this.tittle = tittle;
        this.poster = poster;
        this.synopsis = synopsis;
        this.rating = rating;
        this.releaseDate = releaseDate;
    }
    @Generated(hash = 1263461133)
    public Movie() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTittle() {
        return this.tittle;
    }
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
    public String getPoster() {
        return this.poster;
    }
    public void setPoster(String poster) {
        this.poster = poster;
    }
    public String getSynopsis() {
        return this.synopsis;
    }
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
    public String getRating() {
        return this.rating;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }
    public String getReleaseDate() {
        return this.releaseDate;
    }
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }


}
