public class Movie {

    private String name;
    private String genre;
    private int audienceNumber;
    private double grossTakings;

    //Accessors & Mutators
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getAudienceNumber() {
        return audienceNumber;
    }

    public void setAudienceNumber(int audienceNumber) {
        this.audienceNumber = audienceNumber;
    }

    public double getGrossTakings() {
        return grossTakings;
    }

    public void setGrossTakings(double grossTakings) {
        this.grossTakings = grossTakings;
    }
}
