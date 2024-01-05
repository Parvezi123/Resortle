package app.booking.Resortle.service;

import app.booking.Resortle.dto.HotelInfo;

public interface RoomService {

    HotelInfo retrieveRoomInfo(String hotelId);
}
