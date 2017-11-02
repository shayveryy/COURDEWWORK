package Model;

public class Playlist {
    @Override
    public String toString() {
        return "Playlist{" +
                "playlistName='" + playlistName + '\'' +
                '}';
    }

    public int getPlaylist() {
        return playlist;
    }

    public void setPlaylist(int playlist) {
        this.playlist = playlist;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public String getArt() {
        return Art;
    }

    public void setArt(String art) {
        Art = art;
    }

    public Playlist(int playlist, String playlistName, String art) {

        this.playlist = playlist;
        this.playlistName = playlistName;
        Art = art;
    }

    private int playlist;
    private String playlistName;
    private String Art;
}
