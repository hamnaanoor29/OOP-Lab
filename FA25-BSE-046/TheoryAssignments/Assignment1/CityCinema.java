package TheoryAssignments.Assignment1;

public class CityCinema {
    String cinemaName;
    CinemaScreen[] screens;
    String city;

    CityCinema(String cinemaName, int screenCount, String city) {
        this.cinemaName = cinemaName;
        this.city = city;
        screens = new CinemaScreen[screenCount];

        Movie movie = new Movie("The Stranger-Chapter 3", "Horror", 92, "2:30 PM");

        for (int i = 0; i < screens.length; i++) {
            screens[i] = new CinemaScreen("Cinema Screen", "Screen" + (i + 1), "IMAX",40,movie);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nCinema Branch: " + cinemaName);
        stringBuilder.append("\nCity: " + city + "\n");

        for (int i = 0; i < screens.length; i++)
            stringBuilder.append(screens[i].toString());

        return stringBuilder.toString();
    }
}