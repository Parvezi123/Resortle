package app.booking.Resortle.service;

import app.booking.Resortle.dto.HotelInfo;
import app.booking.Resortle.dto.RoomInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Override
    public HotelInfo retrieveHotelInfo(String hotelId) {
        RoomInfo roomInfo1 = RoomInfo.builder()
                .roomNo("1A101")
                .roomType("Executive Room")
                .roomCapacity(2)
                .roomPrice(2598.0)
                .roomBookedBy("None")
                .roomStatus("Available")
                .build();
        RoomInfo roomInfo2 = RoomInfo.builder()
                .roomNo("1A102")
                .roomType("Suite Room")
                .roomCapacity(4)
                .roomPrice(4578.0)
                .roomBookedBy("None")
                .roomStatus("Available")
                .build();
        return HotelInfo.builder()
                .hotelName("Pandya Hotels")
                .hotelAddress("24th lane, Main Rd, Angadi")
                .hotelLocation("Madurai")
                .hotelZipcode("562289")
                .rooms(List.of(roomInfo1, roomInfo2))
                .build();
    }

    @Override
    public RoomInfo retrieveRoomInfo(String hotelId, String roomId) {
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
