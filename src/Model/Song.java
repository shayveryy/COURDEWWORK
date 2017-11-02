package Model;

public class Song {
    @Override
    public String toString() {
        return "Song{" +
                "songName='" + songName + '\'' +
                '}';
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public Song(int songId, String songName, int albumId) {

        this.songId = songId;
        this.songName = songName;
        this.albumId = albumId;
    }

    private int songId;
    private String songName;
    private int albumId;
}
