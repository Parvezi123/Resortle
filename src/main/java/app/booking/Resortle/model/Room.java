package app.booking.Resortle.model;

public record Room(String roomId, String roomType, String roomNo, Integer roomCapacity, String roomBookedBy, Double roomPrice, String roomStatus) {
}
