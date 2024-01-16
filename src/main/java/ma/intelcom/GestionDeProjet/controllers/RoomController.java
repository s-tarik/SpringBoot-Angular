package ma.intelcom.GestionDeProjet.controllers;

import ma.intelcom.GestionDeProjet.models.Room;
import ma.intelcom.GestionDeProjet.services.RoomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")
@CrossOrigin
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @PostMapping
    public Room createRoom(@RequestBody Room room) {
        return roomService.createRoom(room);
    }

    @GetMapping("/{id}")

    public Room getRoomById(@PathVariable Long id){
        return  roomService.getRoomById(id);
    }

    @GetMapping

    public List<Room> getAllRooms(){
        return roomService.getAllRooms();
    }

    @PutMapping("/{id}")

    public Room updateRoom(@PathVariable Long id, @RequestBody Room room){
        room.setId(id);
        return roomService.updateRoom(id,room);
    }

    @DeleteMapping("/{id}")

    public void deleteRoom(@PathVariable Long id){
        RoomService.deleteRoom(id);
    }
}
