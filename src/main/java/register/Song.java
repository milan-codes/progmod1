package register;

public class Song {
    private String band;
    private String title;
    private double lengthInMinutes;

    public Song() {}

    public Song(String band, String title, double length) {
        this.band = band;
        this.title = title;
        this.lengthInMinutes = length;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getLengthInMinutes() {
        return lengthInMinutes;
    }

    public void setLengthInMinutes(double lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }

    @Override
    public String toString() {
        return String.format("Band: %s\nTitle: %s\nLength:%.2f\n", band, title, lengthInMinutes);
    }
}
