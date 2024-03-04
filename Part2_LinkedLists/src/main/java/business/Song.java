package business;

import java.util.Objects;

/**
 *
 * @author michelle
 */
public class Song {

    private String artist;
    private String title;


    public Song(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }

    /// no argument constructor
    public Song(){
        this.artist= "Prince";
        this.title = "Housequake";
    }


    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(artist, song.artist) && Objects.equals(title, song.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artist, title);
    }

    @Override
    public String toString() {
        return "Song{" +
                "artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}

