class MovieTicket {
    String movie, seatNo;

    { System.out.println("Booking Started"); }

    MovieTicket() { this("Regular Movie", "B01"); }
    MovieTicket(String movie) { this(movie, "B01"); }

    MovieTicket(String movie, String seatNo) {
        this.movie = movie;
        this.seatNo = seatNo;
        System.out.println("Movie: " + movie);
        System.out.println("Seat No: " + seatNo);
    }
}