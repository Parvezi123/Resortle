package app.booking.Resortle.service;

import app.booking.Resortle.dto.HotelRequest;
import app.booking.Resortle.dto.HotelResponse;
import app.booking.Resortle.model.Hotel;

import java.util.List;

import static java.util.UUID.randomUUID;

public class HotelServiceImpl implements HotelService {
    @Override
    public List<HotelResponse> getHotelList() {

        return List.of(null, null);
    }

    @Override
    public HotelResponse getHotelById(String hotelId) {
        return null;
    }

    @Override
    public HotelResponse addHotel(HotelRequest hotelRequest) {
        Hotel hotel = Hotel.builder()
                .hotelId(randomUUID().toString())
                .hotelName(hotelRequest.hotelName())
                .hotelAddress(hotelRequest.hotelAddress())
                .hotelLocation(hotelRequest.hotelLocation())
                .hotelZipcode(hotelRequest.hotelZipcode())
                .build();
        System.out.println("Generated Hotel Id: " + hotel.hotelId() + " HotelName: " + hotel.hotelName());
        return HotelResponse.builder()
                .hotelName(hotel.hotelName())
                .hotelAddress(hotel.hotelAddress())
                .hotelLocation(hotel.hotelLocation())
                .hotelZipcode(hotel.hotelZipcode())
                .build();
    }

    @Override
    public void deleteHotelById(String hotelId) {

    }
}
