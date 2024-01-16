package app.booking.Resortle.service;

import app.booking.Resortle.dto.HotelRequest;
import app.booking.Resortle.dto.HotelResponse;
import app.booking.Resortle.model.Hotel;

import java.util.List;

import static java.util.UUID.randomUUID;

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

    @Override
    public HotelResponse getHotelById(String hotelId) {
        return HotelResponse.builder()
                .hotelName("Mumbai Hotels")
                .hotelAddress("Goregoan")
                .hotelLocation("Navi Mumbai")
                .hotelZipcode("670003")
                .build();
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
}
