package cinema;


public class Cinema {
    public static final Time OPEN_TIME = new Time(10, 0);
    public static final Time CLOSE_TIME = new Time(23, 59);


    public static void main(String[] args) {
        Movie movie1 = new Movie("Titanic", new Time(1, 45));

        Schedule.getInstance().addSeance(Day.FRIDAY, new Seance(movie1, new Time(10, 00)));
        Schedule.getInstance().addSeance(Day.FRIDAY, new Seance(movie1, new Time(12, 00)));

        Movie movie2 = new Movie("Back to the future", new Time(2, 15));

        Schedule.getInstance().addSeance(Day.MONDAY, new Seance(movie2, new Time(10, 00)));
        Schedule.getInstance().addSeance(Day.WEDNESDAY, new Seance(movie2, new Time(20, 00)));
        Schedule.getInstance().addSeance(Day.FRIDAY, new Seance(movie2, new Time(15, 00)));

        Seance s = Schedule.getInstance().getSeancesOnDay(Day.FRIDAY).get(0);
        s.setSeat(1, 1);
        s.setSeat(2, 2);
        s.setSeat(3, 5);
        s.printSeats(movie2,Day.FRIDAY);

        Schedule.getInstance().printSeances(Day.FRIDAY);
        System.out.println();

        MoviesLibrary.printLibrary();


        System.out.println();
        Schedule.getInstance().printSeances(Day.MONDAY);

        System.out.println();
        Schedule.getInstance().seancesByMovie(movie1);

        System.out.println();
        Schedule.getInstance().printSeances(Day.FRIDAY);
        MoviesLibrary.printLibrary();
        Schedule.getInstance().removeMovie("Titanic");

        System.out.println();
        Schedule.getInstance().printSeances(Day.FRIDAY);
        System.out.println();
        MoviesLibrary.printLibrary();

        System.out.println();
        Schedule.getInstance().printSeances(Day.FRIDAY);


    }




}
