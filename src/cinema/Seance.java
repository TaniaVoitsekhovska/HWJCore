package cinema;

public class Seance {

    public Seat[][] seats;

    private Movie movie;
    private Time startTime;
    private Time endTime;

    public Seance(Movie movie, Time startTime) {
        this.movie = movie;
        this.startTime = startTime;
        this.endTime = Time.movieDurationSeance(startTime, movie.getDuration());
        this.seats = new Seat[10][10];
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public void printSeats(Movie movie, Day day) {
        System.out.println("Seats '"+movie.getTitle()+"' for "+day+ " on hour "+getStartTime()+" :\n + is taken, - is free");
        System.out.print("  ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(" "+i+" ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(i+1+":");
            for (int j = 0; j < 10; j++)
                System.out.print(seats[i][j] == null ? " - " : " + ");

            System.out.println();
        }
    }

    public void setSeat( int line, int seat) {
        seats[line - 1][seat - 1] = new Seat(line, seat);
    }

    @Override
    public String toString() {
        return "Seance{" +
                "movie=" + movie +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
