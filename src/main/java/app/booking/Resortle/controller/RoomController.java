package app.booking.Resortle.controller;

import app.booking.Resortle.dto.RoomInfo;
import app.booking.Resortle.dto.RoomRequest;
import app.booking.Resortle.service.RoomService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hotel/room")
public class RoomController {

    @Resource
    RoomService roomService;

    @GetMapping
    public RoomInfo retrieveRoom(
            @RequestHeader(value = "roomId") String roomId) {
        return roomService.retrieveRoomInfo(roomId);
    }

    @PostMapping
    public RoomInfo createRoom(
            @RequestHeader(value = "hotelId") String hotelId,
            @RequestBody RoomRequest roomRequest) {
         return roomService.createRoom(hotelId, roomRequest);
    }
}
