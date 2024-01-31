package app.booking.Resortle.repository;

import app.booking.Resortle.dto.HotelResponse;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HotelRepositoryImpl implements HotelRepository {



    private final JdbcClient jdbcClient;

    public HotelRepositoryImpl(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }


    @Override
    public List<HotelResponse> getHotelList() {
        String sql = """

                SELECT hotel_name, hotel_address, hotel_location, hotel_zipcode FROM public.hotel ORDER BY hotel_id ASC
                """;
        return jdbcClient.sql(sql).query(HotelResponse.class).stream().toList();
    }
}
