package cinema;


public class Cinema {
    public static final Time OPEN_TIME = new Time(10, 0);
    public static final Time CLOSE_TIME = new Time(23, 59);


    public static void main(String[] args) {
        Movie movie1 = new Movie("Titanic", new Time(1, 45));

        Schedule.getInstance().addSeance(Day.FRIDAY, new Seance(movie1, new Time(10, 00)));
        Schedule.getInstance().addSeance(Day.FRIDAY, new Seance(movie1, new Time(12, 00)));

        Seance s = Schedule.getInstance().getSeancesOnDay(Day.FRIDAY).get(0);
        s.setSeat(1, 1);
        s.setSeat(2, 2);
        s.setSeat(3, 5);
        s.printSeats();

        Schedule.getInstance().printSeances(Day.FRIDAY);
    }
}
