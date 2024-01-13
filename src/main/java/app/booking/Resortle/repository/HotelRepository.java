package app.booking.Resortle.repository;

import app.booking.Resortle.dto.HotelRequest;
import app.booking.Resortle.dto.HotelResponse;
import app.booking.Resortle.model.Hotel;

import java.util.List;

public interface HotelRepository {

    HotelResponse createHotel(HotelRequest hotelRequest);

    HotelResponse getHotel(String hotelId);

    List<HotelResponse> getHotelList();

    HotelResponse updateHotel(String hotelId, Hotel hotel);

    void deleteHotel(String hotelId);
}
