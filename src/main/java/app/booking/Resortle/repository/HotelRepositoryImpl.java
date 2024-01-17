package app.booking.Resortle.repository;

import app.booking.Resortle.dto.HotelRequest;
import app.booking.Resortle.dto.HotelResponse;
import app.booking.Resortle.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HotelRepositoryImpl implements HotelRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public HotelResponse createHotel(HotelRequest hotelRequest) {
        return null;
    }

    @Override
    public HotelResponse getHotel(String hotelId) {
        return null;
    }

    @Override
    public List<HotelResponse> getHotelList() {
        return null;
    }

    @Override
    public HotelResponse updateHotel(String hotelId, Hotel hotel) {
        return null;
    }

    @Override
    public void deleteHotel(String hotelId) {

    }
}
