package app.booking.Resortle.dto;


import lombok.Builder;

@Builder
public record RoomInfo(String roomType, String roomNo, Integer roomCapacity, String roomBookedBy, Double roomPrice, String roomStatus) {
}
