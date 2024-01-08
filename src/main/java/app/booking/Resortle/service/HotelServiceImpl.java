package app.booking.Resortle.service;

import app.booking.Resortle.dto.HotelResponse;

import java.util.List;

public class HotelServiceImpl implements HotelService {
    @Override
    public List<HotelResponse> getHotelList() {
        HotelResponse hotel1 = HotelResponse.builder()
                .hotelName("Taj Hotel")
                .hotelAddress("Andheri West Post")
                .hotelLocation("Mumbai")
                .hotelZipcode("400001")
                .build();

        HotelResponse hotel2 = HotelResponse.builder()
                .hotelName("Minerva Grand")
                .hotelAddress("SD Road, Main Street")
                .hotelLocation("Hyderabad")
                .hotelZipcode("65220")
                .build();
        return List.of(hotel1, hotel2);
    }
}
