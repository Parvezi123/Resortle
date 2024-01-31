package app.booking.Resortle.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class HotelResponse {
    String hotelName;
    String hotelAddress;
    String hotelLocation;
    String hotelZipcode;
}
