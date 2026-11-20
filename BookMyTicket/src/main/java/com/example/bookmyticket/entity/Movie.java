package com.example.bookmyticket.entity;
import jakarta.persistence.*;
@Entity @Table(name="movies")
public class Movie {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @Column(nullable=false) private String title; private String genre, language; private Integer durationMinutes;
 @Column(length=1200) private String description; @Column(length=1000) private String posterUrl;
 public Movie() {}
 public Movie(String t,String g,String l,Integer d,String desc,String p){title=t;genre=g;language=l;durationMinutes=d;description=desc;posterUrl=p;}
 public Long getId(){return id;} public String getTitle(){return title;} public String getGenre(){return genre;} public String getLanguage(){return language;} public Integer getDurationMinutes(){return durationMinutes;} public String getDescription(){return description;} public String getPosterUrl(){return posterUrl;}
}
