package com.example.bookmyticket.entity;
import jakarta.persistence.*;
@Entity @Table(name="theatres")
public class Theatre { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @Column(nullable=false) private String name; private String location; public Theatre(){} public Theatre(String n,String l){name=n;location=l;} public Long getId(){return id;} public String getName(){return name;} public String getLocation(){return location;} }
