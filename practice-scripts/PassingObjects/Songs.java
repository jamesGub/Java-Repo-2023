package PassingObjects;

public class Songs {
    // Constructor for our songs that will go into the playlist
    // Couple of characteristics

    String title;
    String artist;
    int year;
    int length;

    Songs(String title, String artist, int year, int length) { 
        this.title = title;
        this.artist = artist;
        this.year = year; 
        this.length = length;
    }

    // If we do not know the length, it is okay.
    Songs(String title, String artist, int year) { 
        this.title = title;
        this.artist = artist;
        this.year = year; 
        
    }
}
