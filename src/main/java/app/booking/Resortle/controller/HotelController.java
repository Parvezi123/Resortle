package app.booking.Resortle.controller;

import app.booking.Resortle.dto.HotelRequest;
import app.booking.Resortle.dto.HotelResponse;
import app.booking.Resortle.service.HotelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/hotel")
public class HotelController {

    private final HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }


    @GetMapping()
    public List<HotelResponse> getHotelList() {
        return hotelService.getHotelList();
    }

    @GetMapping("/{hotelId}")
    public HotelResponse getHotelById(@PathVariable String hotelId) {
        return hotelService.getHotelById(hotelId);
    }

    @PostMapping()
    public HotelResponse createHotel(@RequestBody HotelRequest hotelRequest) {
        return hotelService.createHotel(hotelRequest);
    }

    @DeleteMapping("/{hotelId}")
    public void deleteHotel(@PathVariable String hotelId) {
        hotelService.deleteHotelById(hotelId);
    }
}
