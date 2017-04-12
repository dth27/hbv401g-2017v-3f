

CREATE TABLE Flight (
  flight_no varchar(25) PRIMARY KEY,
  seats int,
  ticket_price int,
  airline varchar(25)
);
CREATE TABLE Schedule (
  flight_id int PRIMARY KEY,
  flight_NO int,  
  departure_time int,
  arrival_time int,
  flight_date int,
  availableSeats int,
  departure_from varchar(50),
  arrival_to varchar(50),
  FOREIGN KEY (flight_NO) REFERENCES Flight (flight_no)
);

CREATE TABLE Passanger (
  name varchar(30),
  SSno int PRIMARY KEY,
  phoneNo int,
  email varchar(30),
  luggage BOOLEAN,
  FOREIGN KEY (bookingId) REFERENCES Booking (bookingId)
   
);

CREATE TABLE Booking (
  Ticket_price int,
  Booking_info int,
  numbofPassenger int,
  paid boolean,
  bookingID int PRIMARY KEY
);

INSERT INTO Flight (flight_no,
  flight_id,
  seats,
  flight_date,
  ticket_price,
  airline)
VALUES (111, 1, 20, 1010, 4395, "flugfelagid");
INSERT INTO Flight (flight_no,
  flight_id,
  seats,
  flight_date,
  ticket_price,
  airline)
VALUES (111, 2, 20, 1011, 2395, "flugfelagid");
INSERT INTO Flight (flight_no,
  flight_id,
  seats,
  flight_date,
  ticket_price,
  airline)
VALUES (112, 23, 50, 0110, 5395, "rvkFelagid");


INSERT INTO schedule (flight_id,
  departure_time,
  arrival_time,
  flight_date,
  departure_from,
  arrival_to)
VALUES (value1, value2, value3, ...);

INSERT INTO Passanger (name,
  SSno,
  phoneNo,
  email,
  luggage)
VALUES (value1, value2, value3, ...);

INSERT INTO Booking (Ticket_price,
  Passenger_info,
  Booking_info,
  paid,
  bookingID)
VALUES (value1, value2, value3, ...);

