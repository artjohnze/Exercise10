package Exercise45;

import java.util.LinkedList;

public class Main {

 public static void main(String[] args) {
        Album album = new Album("Greatest Hits", "Artist Name");

        album.addSong("Song One", 3.45);
        album.addSong("Song Two", 4.20);
        album.addSong("Song Three", 2.58);

        LinkedList<Song> playList = new LinkedList<>();

        album.addToPlayList("Song One", playList);
        album.addToPlayList(2, playList);
        album.addToPlayList(3, playList);
        album.addToPlayList("Non-existent Song", playList); // Won't be added

        System.out.println("Playlist:");
        for (Song song : playList) {
            System.out.println(song);
        }
    }
}
