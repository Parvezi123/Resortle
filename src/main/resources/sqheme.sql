-- Contents of schema.sql
CREATE TABLE hotel (
                       hotel_id VARCHAR(255) PRIMARY KEY,
                       hotel_name VARCHAR(255),
                       room_id VARCHAR(255),
                       hotel_location VARCHAR(255),
                       hotel_address VARCHAR(255),
                       hotel_zipcode VARCHAR(20),
                       FOREIGN KEY (room_id) REFERENCES room(room_id)
);
CREATE TABLE room (
                      room_id VARCHAR(255) PRIMARY KEY,
                      room_type VARCHAR(255),
                      room_no VARCHAR(10),
                      room_capacity INTEGER,
                      room_booked_by VARCHAR(255),
                      room_price DOUBLE PRECISION,
                      room_status VARCHAR(50)
);