package app.booking.Resortle.repository;

import app.booking.Resortle.dto.RoomInfo;
import app.booking.Resortle.dto.RoomRequest;

public interface RoomRepository {
    RoomInfo createRoom(RoomRequest roomRequest);
}
