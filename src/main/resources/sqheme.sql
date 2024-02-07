-- schema.sql

-- Create the hotel table
CREATE TABLE IF NOT EXISTS hotel
(
    hotel_id       VARCHAR(255) PRIMARY KEY,
    hotel_name     VARCHAR(255),
    room_id        VARCHAR(255),
    hotel_location VARCHAR(255),
    hotel_address  VARCHAR(255),
    hotel_zipcode  VARCHAR(255)
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
-- Insert values into the room table
INSERT INTO room (room_id, room_type, room_no, room_capacity, room_booked_by, room_price, room_status)
VALUES
    ('101', 'Single', '101A', 1, 'None', 1000.00, 'Available'),
    ('102', 'Double', '102B', 2, 'None', 1500.00, 'Available'),
    ('103', 'Suite', '103C', 3, 'None', 2000.00, 'Available'),
    ('104', 'Single', '104D', 1, 'None', 1200.00, 'Available'),
    ('105', 'Double', '105E', 2, 'None', 1800.00, 'Available'),
    ('106', 'Suite', '106F', 3, 'None', 2200.00, 'Available'),
    ('107', 'Single', '107G', 1, 'None', 1100.00, 'Available'),
    ('108', 'Double', '108H', 2, 'None', 1600.00, 'Available');
-- Insert values into the hotel table with corresponding room_id
INSERT INTO hotel (hotel_id, hotel_name, room_id, hotel_location, hotel_address, hotel_zipcode)
VALUES
    ('1', 'Hotel Paradise', '101', 'Chennai', '123 Anna St', '600078'),
    ('2', 'Hotel Richards', '105', 'Bengaluru', '456 IndiraNagar St', '560067'),
    ('3', 'Hotel SunVilla', '107', 'Hyderabad', '789 GachiBowli St', '768890');
-- Insert additional values into the hotel table with corresponding room_id
INSERT INTO hotel (hotel_id, hotel_name, room_id, hotel_location, hotel_address, hotel_zipcode)
VALUES
    ('4', 'Hotel Danchiards', '102', 'Chennai', '101 Perambalur St', '45678'),
    ('5', 'Hotel Mahendra', '104', 'Pune', '202 Highstreet Ln', '98765'),
    ('6', 'Hotel Cityknights', '108', 'Bhopal', '303 AurovillaSantualry Rd', '54321');