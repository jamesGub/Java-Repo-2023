package PassingObjects;

public class Playlist {
    
    // Set up the data type, can only pass objects of that type, in this case it's song.
    void add(Songs song) { 
        System.out.println(song.title + " by " + song.artist + " released in " + song.year + " has been added to your playlist.");
    } 
}
