package pass_in.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pass_in.domain.attendee.Attendee;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Repository
public interface AttendeeRepository  extends JpaRepository<Attendee, String>{

    List<Attendee> findByEventId(String eventId);

    Optional<Attendee> findByEventIdAndEmail(String eventId, String email);

}
