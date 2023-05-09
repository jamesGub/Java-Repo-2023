package statics;

public class VideoGame {
    String title;
    String platform;
    String developer;
    int release;
    static int numberOfGames;

    VideoGame(String title, String platform, String developer, int release) { 
        this.title = title; 
        this.platform = platform; 
        this.developer = developer; 
        this.release = release; 
        // Keep track of how many objects we have.
        numberOfGames++;
    }
}
