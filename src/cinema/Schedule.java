package cinema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public final class Schedule {

    private Map<Day, ArrayList<Seance>> seances;
    private static Schedule instance;

    private Schedule() {
        seances = new HashMap<>();
    }

    public static Schedule getInstance() {
        if (instance == null) {
            instance = new Schedule();

        }
        return instance;
    }

    public ArrayList<Seance> getSeancesOnDay(Day day) {
        if (seances.containsKey(day)) {
            return seances.get(day);
        } else {
            throw new RuntimeException("There is no seances on the day");
            //seances.put(day, new ArrayList<>());
            //return seances.get(day);
        }
    }

    public void addSeance(Day day, Seance seance) {
        if (seances.containsKey(day)) {
            if (isSeanceTimeFree(day, seance))
                seances.get(day).add(seance);
            else
                throw new RuntimeException("On that time already scheduled another seance.");
        } else {
            ArrayList<Seance> seancesList = new ArrayList<>();
            seancesList.add(seance);
            seances.put(day, seancesList);
        }
    }

    private boolean isSeanceTimeFree(Day day, Seance seanceToAdd) {
        return seances.get(day).stream().allMatch(seance -> seanceInWorkingHours(seanceToAdd) && twoSeancesDontOverlap(seance, seanceToAdd));
    }

    private boolean twoSeancesDontOverlap(Seance s1, Seance s2) {
        if (s1.getStartTime().isAfter(s2.getEndTime()))
            return true;
        if (s1.getEndTime().isBefore(s2.getStartTime()))
            return true;

        return false;
    }

    private boolean seanceInWorkingHours(Seance seanceToAdd) {
        return (seanceToAdd.getStartTime().isAfter(Cinema.OPEN_TIME) && seanceToAdd.getStartTime().isBefore(Cinema.CLOSE_TIME)) &&
                (seanceToAdd.getEndTime().isAfter(Cinema.OPEN_TIME) && seanceToAdd.getEndTime().isBefore(Cinema.CLOSE_TIME));
    }

    public void printSeances(Day day) {
        if (seances.containsKey(day)) {
            seances.get(day).stream().forEach(seance -> System.out.println(seance.toString()));
        }
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "seances=" + seances +
                '}';
    }
}
