package ma.intelcom.GestionDeProjet.services;


import ma.intelcom.GestionDeProjet.models.Room;
import ma.intelcom.GestionDeProjet.repositories.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;


@Service
public class RoomService {

   private static RoomRepository roomRepository = null;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public Room createRoom(Room room){
        return roomRepository.save(room);
    }


    public Room getRoomById (Long id){
        return roomRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("salle non trouvée par l'id: " +id));
    }


    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }



    public Room updateRoom(Long id , Room room) {
        return roomRepository.save(room);
    }


    public static void deleteRoom(Long id) {
        roomRepository.deleteById(id);
    }
}

