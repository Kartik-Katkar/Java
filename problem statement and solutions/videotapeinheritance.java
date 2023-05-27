class VideoTape {
    protected String title;
    protected int duration;

    public VideoTape(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public void displayInfo() {
        System.out.println("Video Title: " + title);
        System.out.println("Duration: " + duration + " minutes");
    }
}

class Movie extends VideoTape {
    private String director;

    public Movie(String title, int duration, String director) {
        super(title, duration);
        this.director = director;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Director: " + director);
    }
}

class MusicVideo extends VideoTape {
    private String artist;

    public MusicVideo(String title, int duration, String artist) {
        super(title, duration);
        this.artist = artist;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Artist: " + artist);
    }
}

public class videotapeinheritance {
    public static void main(String[] args) {
        VideoTape videoTape = new VideoTape("Generic Video", 120);
        Movie movie = new Movie("The Movie", 150, "John Director");
        MusicVideo musicVideo = new MusicVideo("The Music Video", 180, "Music Artist");

        System.out.println("Video Tape Information:");
        videoTape.displayInfo();
        System.out.println();

        System.out.println("Movie Information:");
        movie.displayInfo();
        System.out.println();

        System.out.println("Music Video Information:");
        musicVideo.displayInfo();
    }
}
