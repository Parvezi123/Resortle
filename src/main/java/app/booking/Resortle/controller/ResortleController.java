package app.booking.Resortle.controller;

import app.booking.Resortle.dto.HotelRequest;
import app.booking.Resortle.dto.HotelResponse;
import app.booking.Resortle.model.Hotel;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import static java.util.UUID.randomUUID;


@RestController
@RequestMapping("/api/hotel")
public class ResortleController {

    @GetMapping()
    public List<Hotel> getHotelList() {
        Hotel hotel = Hotel.builder().hotelId(randomUUID().toString())
                .hotelName(randomUUID().toString())
                .hotelAddress(randomUUID().toString())
                .hotelLocation(randomUUID().toString())
                .hotelZipcode(randomUUID().toString())
                .build();
        return List.of(hotel);
    }

    @PostMapping()
    public HotelResponse addHotel(@RequestBody HotelRequest hotelRequest) {
        Hotel hotel = Hotel.builder()
                .hotelId(randomUUID().toString())
                .hotelName(hotelRequest.hotelName())
                .hotelAddress(hotelRequest.hotelAddress())
                .hotelLocation(hotelRequest.hotelLocation())
                .hotelZipcode(hotelRequest.hotelZipcode())
                .build();
        return HotelResponse.builder()
                .hotelName(hotel.hotelName())
                .hotelAddress(hotel.hotelAddress())
                .hotelLocation(hotel.hotelLocation())
                .hotelZipcode(hotel.hotelZipcode())
                .build();
    }
}
