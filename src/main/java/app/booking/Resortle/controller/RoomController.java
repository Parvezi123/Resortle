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
            @RequestHeader(value = "roomId") String roomId) {
        return roomService.retrieveHotelInfo(roomId);
    }

    @GetMapping("/amenities")
    public RoomInfo retrieveAmenities(
            @RequestHeader(value = "roomId") String roomId) {
        return roomService.retrieveRoomInfo(roomId);
    }

    @GetMapping
    public HotelInfo retrieveAmenities(
            @RequestHeader(value = "roomId") String hotelId) {
        return roomService.retrieveRoomInfo(roomId);
    }

    @GetMapping
    public HotelInfo retrieveInfo(
            @RequestHeader(value = "roomId") String hotelId) {
        return roomService.retrieveRoomInfo(roomId);
    }

    @GetMapping
    public HotelInfo retrieveData(
            @RequestHeader(value = "hotelId") String hotelId) {
        return roomService.retrieveRoomInfo(hotelId);
    }







}
