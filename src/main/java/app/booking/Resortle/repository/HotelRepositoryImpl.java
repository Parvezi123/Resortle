package app.booking.Resortle.repository;

import app.booking.Resortle.dto.HotelResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class HotelRepositoryImpl implements HotelRepository {

    private final JdbcClient jdbcClient;

    public HotelRepositoryImpl(DataSource dataSource) {
        this.jdbcClient = JdbcClient.create(dataSource);
    }


    @Override
    public List<HotelResponse> getHotelList() {
        String sql = """

                SELECT hotel_name, hotel_address, hotel_location, hotel_zipcode FROM public.hotel ORDER BY hotel_id ASC
                """;
        return jdbcClient.sql(sql).query(HotelResponse.class).list();
    }
}
