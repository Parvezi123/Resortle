package app.booking.Resortle.repository;

import app.booking.Resortle.dto.HotelResponse;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository{
    List<HotelResponse> getHotelList();
}
