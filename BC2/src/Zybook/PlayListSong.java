package Zybook;

public class PlaylistSong {
    private String name;
    private PlaylistSong nextPlaylistSongRef;

    PlaylistSong() {
        this.name = "";
        nextPlaylistSongRef = null;
    }

    PlaylistSong(String name) {
        this.name = name;
        this.nextPlaylistSongRef = null;
    }

    PlaylistSong(String name, PlaylistSong nextLoc) {
        this.name = name;
        this.nextPlaylistSongRef = nextLoc;
    }

    void insertAfter(PlaylistSong nodeLoc) {
        PlaylistSong tmpNext = null;

        tmpNext = this.nextPlaylistSongRef;
        this.nextPlaylistSongRef = nodeLoc;
        nodeLoc.nextPlaylistSongRef = tmpNext;
    }

    PlaylistSong GetNext() {
        return this.nextPlaylistSongRef;
    }

    void PrintNodeData() {
        System.out.println(this.name);
    }
}

