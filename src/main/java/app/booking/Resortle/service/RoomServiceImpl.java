package app.booking.Resortle.service;

import app.booking.Resortle.dto.RoomInfo;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {

    @Override
    public RoomInfo retrieveRoomInfo(String roomId) {
        return RoomInfo.builder()
                .roomNo("1A101")
                .roomType("Executive Room")
                .roomCapacity(2)
                .roomPrice(2598.0)
                .roomBookedBy("None")
                .roomStatus("Available")
                .build();
    }
}
