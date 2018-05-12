package com.ghozay19.arsitekturandro.data.db.model;

import android.arch.persistence.room.Entity;

import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;

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


}
