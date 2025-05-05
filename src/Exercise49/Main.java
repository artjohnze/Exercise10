package Exercise49;

import java.util.LinkedList;
import java.util.ArrayList;
public class Main {

 public static void main(String[] args) {
  Album album = new Album("Greatest Hits", "Artist A");
  album.addSong("Song One", 4.5);
  album.addSong("Song Two", 3.8);
  album.addSong("Song Three", 5.2);

  LinkedList<Song> playList = new LinkedList<>();

  album.addToPlayList(1, playList);
  album.addToPlayList(2, playList);
  album.addToPlayList("Song Three", playList);
  album.addToPlayList(5, playList); // Invalid track number
  album.addToPlayList("Nonexistent Song", playList); // Invalid title

  System.out.println("\nPlaylist:");
  for (Song song : playList) {
      System.out.println(song);
  }
}
}