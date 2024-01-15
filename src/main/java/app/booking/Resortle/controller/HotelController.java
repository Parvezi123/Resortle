package app.booking.Resortle.controller;

import app.booking.Resortle.dto.HotelRequest;
import app.booking.Resortle.dto.HotelResponse;
import app.booking.Resortle.model.Hotel;
import app.booking.Resortle.service.HotelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import static java.util.UUID.randomUUID;


@RestController
@RequestMapping("/api/hotel")
public class HotelController {

    private HotelService hotelService;

    @GetMapping()
    public List<HotelResponse> getHotelList() {
        return hotelService.getHotelList();
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
        System.out.println("Generated Hotel Id: " + hotel.hotelId() + " HotelName: " + hotel.hotelName());
        return HotelResponse.builder()
                .hotelName(hotel.hotelName())
                .hotelAddress(hotel.hotelAddress())
                .hotelLocation(hotel.hotelLocation())
                .hotelZipcode(hotel.hotelZipcode())
                .build();
    }
}
