package app.booking.Resortle.dto;

import lombok.Builder;

@Builder
public record HotelResponse(String hotelName, String hotelAddress, String hotelLocation, String hotelZipcode) {
}
