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
