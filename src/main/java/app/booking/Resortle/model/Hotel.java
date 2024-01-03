package app.booking.Resortle.model;


import lombok.Builder;

@Builder
public record Hotel(String hotelId, String hotelName, String hotelLocation, String hotelAddress, String hotelZipcode) {
}
