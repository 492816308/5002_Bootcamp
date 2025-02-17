package Zybook;

public class CallPlaylistSong {
    public static void main(String[] args) {
        PlaylistSong headObj = null;
        PlaylistSong firstSong = null;
        PlaylistSong secondSong = null;
        PlaylistSong thirdSong = null;
        PlaylistSong currObj = null;

        headObj = new PlaylistSong("head");

        firstSong = new PlaylistSong("Lacrimosa");
        headObj.insertAfter(firstSong);

        secondSong = new PlaylistSong("Vocalise");
        firstSong.insertAfter(secondSong);

        thirdSong = new PlaylistSong("Adagio");
        secondSong.insertAfter(thirdSong);

        currObj = headObj;

        while (currObj != null) {
            currObj.PrintNodeData();
            currObj = currObj.GetNext();
        }
    }
}