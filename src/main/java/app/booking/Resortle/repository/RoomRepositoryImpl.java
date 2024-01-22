package app.booking.Resortle.repository;

import app.booking.Resortle.dto.RoomInfo;
import app.booking.Resortle.dto.RoomRequest;
import org.springframework.jdbc.core.simple.JdbcClient;

public class RoomRepositoryImpl implements RoomRepository {

    private JdbcClient jdbcClient;

    @Override
    public RoomInfo createRoom(RoomRequest roomRequest) {
        jdbcClient.sql("");
        return null;
    }
}
