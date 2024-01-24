-- schema.sql

-- Create the hotel table
CREATE TABLE IF NOT EXISTS hotel (
                                     hotel_id VARCHAR(255) PRIMARY KEY,
                                     hotel_name VARCHAR(255),
                                     room_id VARCHAR(255),
                                     hotel_location VARCHAR(255),
                                     hotel_address VARCHAR(255),
                                     hotel_zipcode VARCHAR(255)
);

-- Create the room table
CREATE TABLE IF NOT EXISTS room (
                                    room_id VARCHAR(255) PRIMARY KEY,
                                    room_type VARCHAR(255),
                                    room_no VARCHAR(255),
                                    room_capacity INTEGER,
                                    room_booked_by VARCHAR(255),
                                    room_price DOUBLE PRECISION,
                                    room_status VARCHAR(255)
);
