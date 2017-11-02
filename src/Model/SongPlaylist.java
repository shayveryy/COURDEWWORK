package Model;

public class SongPlaylist {
    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public int getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(int playlistId) {
        this.playlistId = playlistId;
    }

    public int getSongPlaylistId() {
        return SongPlaylistId;
    }

    public void setSongPlaylistId(int songPlaylistId) {
        SongPlaylistId = songPlaylistId;
    }

    public SongPlaylist(int songId, int playlistId, int songPlaylistId) {

        this.songId = songId;
        this.playlistId = playlistId;
        SongPlaylistId = songPlaylistId;
    }

    private int songId;
    private int playlistId;
    private int SongPlaylistId;
}
