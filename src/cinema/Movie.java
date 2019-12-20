package cinema;

public class Movie {

    private String title;

    private Time duration;

    public Movie(String title, Time duration) {
        this.title = title;
        this.duration = duration;
        MoviesLibrary.addMovieToLibrary(this);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Time getDuration() {
        return duration;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }

    public  int addBreak(){
        if(duration.getMin()>=30){
            return 60-duration.getMin();
        }else
            return 30-duration.getMin();
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
