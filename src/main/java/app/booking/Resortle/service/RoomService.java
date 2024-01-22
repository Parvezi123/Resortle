package app.booking.Resortle.service;

import app.booking.Resortle.dto.RoomInfo;
import app.booking.Resortle.dto.RoomRequest;

public interface RoomService {

    RoomInfo retrieveRoomInfo(String roomId);

    RoomInfo createRoom(String hotelId, RoomRequest roomRequest);
}
