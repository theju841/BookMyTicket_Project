package com.example.bookmyticket.entity;
import jakarta.persistence.*;
@Entity @Table(name="booked_seats",uniqueConstraints=@UniqueConstraint(columnNames={"show_id","seat_number"}))
public class BookedSeat { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @ManyToOne(optional=false,fetch=FetchType.LAZY) @JoinColumn(name="show_id") private MovieShow movieShow; @ManyToOne(optional=false,fetch=FetchType.LAZY) @JoinColumn(name="booking_id") private Booking booking; @Column(name="seat_number",nullable=false) private String seatNumber; public BookedSeat(){} public BookedSeat(MovieShow s,Booking b,String n){movieShow=s;booking=b;seatNumber=n;} public Long getId(){return id;} public String getSeatNumber(){return seatNumber;} public Booking getBooking(){return booking;} }
