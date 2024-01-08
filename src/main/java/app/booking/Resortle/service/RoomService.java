package app.booking.Resortle.service;

import app.booking.Resortle.dto.HotelInfo;
import app.booking.Resortle.dto.RoomInfo;

public interface RoomService {

    HotelInfo retrieveHotelInfo(String hotelId);

    RoomInfo retrieveRoomInfo(String hotelId, String roomId);
}
