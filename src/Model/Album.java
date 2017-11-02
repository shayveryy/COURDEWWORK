package Model;

public class Album
{
    @Override
    public String toString() {
        return "Album{" +
                "albumName='" + albumName + '\'' +
                '}';
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public String getAlbumArt() {
        return albumArt;
    }

    public void setAlbumArt(String albumArt) {
        this.albumArt = albumArt;
    }

    public Album(int albumId, String albumName, int artistId, String albumArt) {

        this.albumId = albumId;
        this.albumName = albumName;
        this.artistId = artistId;
        this.albumArt = albumArt;
    }

    private int albumId;
    private String albumName;
    private int artistId;
    private String albumArt;
}
