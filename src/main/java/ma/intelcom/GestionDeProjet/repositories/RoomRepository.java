package ma.intelcom.GestionDeProjet.repositories;

import ma.intelcom.GestionDeProjet.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
