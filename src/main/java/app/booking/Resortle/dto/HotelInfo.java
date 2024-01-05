package app.booking.Resortle.dto;

import lombok.Builder;

import java.util.List;

@Builder
public record HotelInfo(String hotelName, List<RoomInfo> rooms, String hotelLocation, String hotelAddress, String hotelZipcode) {
}
