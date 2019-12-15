package cinema;

public class Seat {
    int line;
    int seat;

    public Seat(int line, int seat) {
        this.line = line;
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "line=" + line +
                ", seat=" + seat +
                '}';
    }
}
