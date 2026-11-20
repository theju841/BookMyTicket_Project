package com.example.bookmyticket.repository;
import com.example.bookmyticket.entity.MovieShow;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
public interface MovieShowRepository extends JpaRepository<MovieShow,Long>{
 @Override @EntityGraph(attributePaths={"movie","theatre"}) Optional<MovieShow> findById(Long id);
 @EntityGraph(attributePaths={"movie","theatre"}) List<MovieShow> findByStartTimeAfterOrderByStartTimeAsc(LocalDateTime t);
 @EntityGraph(attributePaths={"movie","theatre"}) List<MovieShow> findByMovieIdAndStartTimeAfterOrderByStartTimeAsc(Long id,LocalDateTime t);
}
