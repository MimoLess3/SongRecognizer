package persistance;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SongDao {
    @Id
    private String id;
    private String songName;
    private int bmp;
    private String artist;

    public SongDao() {
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public int getBmp() {
        return bmp;
    }

    public void setBmp(int bmp) {
        this.bmp = bmp;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

