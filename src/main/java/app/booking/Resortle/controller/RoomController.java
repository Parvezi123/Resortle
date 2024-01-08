package app.booking.Resortle.controller;

import app.booking.Resortle.dto.HotelInfo;
import app.booking.Resortle.dto.RoomInfo;
import app.booking.Resortle.service.RoomService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hotel/room")
public class RoomController {

    @Resource
    RoomService roomService;

    @GetMapping
    public HotelInfo retrieveRoom(
            @RequestHeader(value = "hotelId") String hotelId) {
        return roomService.retrieveHotelInfo(hotelId);
    }

    @GetMapping("/{roomId}/amenities")
    public RoomInfo retrieveAmenities(
            @RequestHeader(value = "hotelId") String hotelId, @PathVariable String roomId) {
        return roomService.retrieveRoomInfo(hotelId, roomId);
    }

}
