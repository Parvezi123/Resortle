package app.booking.Resortle.service;

import app.booking.Resortle.dto.HotelRequest;
import app.booking.Resortle.dto.HotelResponse;
import app.booking.Resortle.repository.HotelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {
    private HotelRepository hotelRepository;

    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public List<HotelResponse> getHotelList() {
        return hotelRepository.getHotelList();
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
