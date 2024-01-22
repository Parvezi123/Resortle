package app.booking.Resortle.service;

import app.booking.Resortle.dto.RoomInfo;
import app.booking.Resortle.dto.RoomRequest;
import app.booking.Resortle.repository.RoomRepository;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {
    RoomRepository roomRepository;

    @Override
    public RoomInfo retrieveRoomInfo(String roomId) {
        return null;
    }

    @Override
    public RoomInfo createRoom(String hotelId, RoomRequest roomRequest) {
        return roomRepository.createRoom(roomRequest);
    }
}
