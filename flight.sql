

CREATE TABLE Flight (
  flight_no varchar(25),
  flight_id int,
  seats int,
  flight_date int,
  ticket_price int,
  airline varchar(25)

);
CREATE TABLE Schedule (
  flight_id int FOREIGN KEY REFERENCES Flight(flight_id),
  departure_time int,
  arrival_time int,
  flight_date int,
  departure_from varchar(50),
  arrival_to varchar(50),
);

CREATE TABLE Passanger (
  name varchar(30),
  SSno int,
  phoneNo int,
  email varchar(30),
  luggage BOOLEAN
);

CREATE TABLE Booking (
  Ticket_price int,
  Passenger_info int,
  Booking_info int,
  paid boolean
)
