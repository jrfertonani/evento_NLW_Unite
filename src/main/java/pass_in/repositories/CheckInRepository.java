package pass_in.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pass_in.domain.checkin.CheckIn;

import java.util.Optional;

@Repository
public interface CheckInRepository extends JpaRepository<CheckIn, Integer>{
    Optional<CheckIn> findByAttendeeId(String attendeeId);

}
