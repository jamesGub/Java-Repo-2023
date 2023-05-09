package statics;

public class VideoGamestatic {
   public static void main(String[] args) { 
    
    VideoGame videogame = new VideoGame("Fortnite ", "PC ", "Epic Games ", 2016);
    VideoGame videoGame2 = new VideoGame("Resident Evil 4 ", "Nintendo GameCube ", "Capcom ", 2005);
    VideoGame videoGame3 = new VideoGame("Pokemon Emerald ", "Nintendo Game Boy Advance ", "Game Freak ", 2003);
    

    VideoGame[] videogames = {videogame, videoGame2, videoGame3}; 
    System.out.println("These are the games in your collection: \n" + "\n" + videogames[0].title + videogames[0].platform + videogames[0].developer + videogames[0].release + "\n");
    System.out.println(videogames[1].title + videogames[1].platform + videogames[1].developer + videogames[1].release + "\n");
    System.out.println(videogames[2].title + videogames[2].platform + videogames[2].developer + videogames[2].release + "\n");

    System.out.println("You have this many games: " + VideoGame.numberOfGames);
   }
}


 // Keyword modifier "Static": A single copy of a variable/method is created and shared.
    //                             The class "owns" the static member.

    // All instances of the class will share this variable. 