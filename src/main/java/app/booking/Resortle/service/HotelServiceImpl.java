package app.booking.Resortle.service;

import app.booking.Resortle.dto.HotelRequest;
import app.booking.Resortle.dto.HotelResponse;
import app.booking.Resortle.repository.HotelRepository;

import java.util.List;

public class HotelServiceImpl implements HotelService {
    private HotelRepository hotelRepository;

    @Override
    public List<HotelResponse> getHotelList() {

        return List.of(null, null);
    }

    @Override
    public HotelResponse getHotelById(String hotelId) {
        return null;
    }

    @Override
    public HotelResponse createHotel(HotelRequest hotelRequest) {
        return null;
    }

    @Override
    public void deleteHotelById(String hotelId) {

    }
}
