package pass_in.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pass_in.domain.event.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, String>{

}
