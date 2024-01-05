package app.booking.Resortle.controller;

import app.booking.Resortle.dto.HotelInfo;
import app.booking.Resortle.service.RoomService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hotel/room")
public class RoomController {

    @Resource
    RoomService roomService;

    @GetMapping
    public HotelInfo retrieveRoom(
            @RequestHeader(value = "hotelId") String hotelId) {
        return roomService.retrieveRoomInfo(hotelId);
    }

}
