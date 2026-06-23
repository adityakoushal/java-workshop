class HotelBooking {
    String customer, roomType;

    { roomType = "Standard"; System.out.println("Booking Initialized"); }

    HotelBooking() { this("Guest", "Standard"); }
    HotelBooking(String customer) { this(customer, "Standard"); }

    HotelBooking(String customer, String roomType) {
        this.customer = customer;
        this.roomType = roomType;
        System.out.println("Customer: " + customer);
        System.out.println("Room Type: " + roomType);
    }
}