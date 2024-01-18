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

    @GetMapping("/{hotelId}")
    public HotelResponse getHotelById(@PathVariable String hotelId) {
        return hotelService.getHotelById(hotelId);
    }

    @PostMapping()
    public HotelResponse addHotel(@RequestBody HotelRequest hotelRequest) {
        return hotelService.addHotel(hotelRequest);
    }

    @DeleteMapping("/{hotelId}")
    public void deleteHotel(@PathVariable String hotelId) {
        hotelService.deleteHotelById(hotelId);
    }
}
