package app.booking.Resortle.service;

import app.booking.Resortle.dto.HotelRequest;
import app.booking.Resortle.dto.HotelResponse;

import java.util.List;

public interface HotelService {

    List<HotelResponse> getHotelList();

    HotelResponse getHotelById(String hotelId);

    HotelResponse addHotel(HotelRequest hotelRequest);
}
