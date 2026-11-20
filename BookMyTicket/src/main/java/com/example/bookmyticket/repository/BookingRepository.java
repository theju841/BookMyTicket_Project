package com.example.bookmyticket.repository;
import com.example.bookmyticket.entity.Booking;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface BookingRepository extends JpaRepository<Booking,Long>{
 @EntityGraph(attributePaths={"movieShow","movieShow.movie","movieShow.theatre"})
 List<Booking> findByEmailIgnoreCaseOrderByBookedAtDesc(String email);
}
