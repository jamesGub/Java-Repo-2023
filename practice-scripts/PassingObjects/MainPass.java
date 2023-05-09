package PassingObjects;

public class MainPass {
    public static void main(String[] args) { 
        // Declare our objects
        Playlist playlist = new Playlist();
        Songs song = new Songs("One More Time", "Daft Punk", 2000);
        Songs song1 = new Songs("HUMBLE.", "Kendrick Lamar", 2017);
        
        // Send the song object to the method
        playlist.add(song); 
        playlist.add(song1); 


    }
}
