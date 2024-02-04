package app.booking.Resortle.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public class HotelResponse {
    String hotelName;
    String hotelAddress;
    String hotelLocation;
    String hotelZipcode;
}
