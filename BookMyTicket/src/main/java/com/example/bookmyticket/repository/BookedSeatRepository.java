package com.example.bookmyticket.repository;
import com.example.bookmyticket.entity.BookedSeat;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface BookedSeatRepository extends JpaRepository<BookedSeat,Long>{
 @EntityGraph(attributePaths={"booking"}) List<BookedSeat> findByMovieShowId(Long id);
 boolean existsByMovieShowIdAndSeatNumber(Long id,String seat);
}
