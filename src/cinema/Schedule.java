package cinema;

import java.util.*;


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
        }
    }

    public void addSeance(Day day, Seance seance) {
        if (seances.containsKey(day)) {
            if (isSeanceTimeFree(day, seance))
                seances.get(day).add(seance);
            else
                throw new RuntimeException("On that time is already scheduled another seance.");
        } else {
            ArrayList<Seance> seancesList = new ArrayList<>();
            seancesList.add(seance);
            seances.put(day, seancesList);
        }
    }

    public void removeSeance(Day day, Seance seance) {
        if (seances.get(day).contains(seance)) {
            seances.get(day).remove(seance);
        } else
            throw new RuntimeException("On that day there is no such seance.");

    }

    public void removeMovie(String string) {

        Iterator<Movie> iterator = MoviesLibrary.getMovies().iterator();
        while (iterator.hasNext()) {
            Movie next = iterator.next();
            if (next.getTitle().equalsIgnoreCase(string)) {
                iterator.remove();
            }
        }
        Iterator<Map.Entry<Day, ArrayList<Seance>>> iterator1 = seances.entrySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry<Day, ArrayList<Seance>> array = iterator1.next();
            Iterator<Seance> iterator2 = array.getValue().iterator();
            while (iterator2.hasNext()) {
                Seance seance = iterator2.next();
                if (seance.getMovie().getTitle().equalsIgnoreCase(string)) {
                    iterator2.remove();
                }
            }
        }
    }

    private boolean isSeanceTimeFree(Day day, Seance seanceToAdd) {
        return seances.get(day).stream().allMatch(seance -> seanceInWorkingHours(seanceToAdd)
                && twoSeancesDontOverlap(seance, seanceToAdd));
    }

    private boolean twoSeancesDontOverlap(Seance s1, Seance s2) {
        if (s1.getStartTime().isAfter(s2.getEndTime()))
            return true;
        if (s1.getEndTime().isBefore(s2.getStartTime()))
            return true;

        return false;
    }

    private boolean seanceInWorkingHours(Seance seanceToAdd) {
        return (seanceToAdd.getStartTime().isAfter(Cinema.OPEN_TIME)
                && seanceToAdd.getStartTime().isBefore(Cinema.CLOSE_TIME))
                && (seanceToAdd.getEndTime().isAfter(Cinema.OPEN_TIME)
                && seanceToAdd.getEndTime().isBefore(Cinema.CLOSE_TIME));
    }

    public void printSeances(Day day) {
        if (seances.containsKey(day)) {
            seances.get(day).stream().forEach(seance -> System.out.println(seance.toString()));
        }
    }

    public void seancesByMovie(Movie movie) {

        System.out.println("Seances for movie " + movie.getTitle() + " are:");
        Iterator<Map.Entry<Day, ArrayList<Seance>>> iterator = seances.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Day, ArrayList<Seance>> array = iterator.next();
            Iterator<Seance> iterator1 = array.getValue().iterator();
            while (iterator1.hasNext()) {
                Seance seance = iterator1.next();
                if (seance.getMovie().getTitle().equalsIgnoreCase(movie.getTitle())) {
                    System.out.println(array.getKey().name() + " starts at " + seance.getStartTime()
                            + ", ends at " + seance.getEndTime());
                }
            }
        }
    }


    @Override
    public String toString() {
        return "Schedule{" +
                "seances=" + seances +
                '}';
    }
}
