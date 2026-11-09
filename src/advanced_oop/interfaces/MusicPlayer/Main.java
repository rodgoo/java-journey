package advanced_oop.interfaces.MusicPlayer;

public class Main {
    public static void main(String[] args) {

        // Creates a new Computer and run music and video on that
        Computer myMusicPlayerComputer = new Computer();
        System.out.println();
        runVideo(myMusicPlayerComputer);
        pauseVideo(myMusicPlayerComputer);
        stopVideo(myMusicPlayerComputer);

        System.out.println("----Divider----");

        Smartphone myiPhonePlayer = new Smartphone();
        runMusic(myiPhonePlayer);
        pauseMusic(myiPhonePlayer);
        stopMusic(myiPhonePlayer);

        runVideo(myiPhonePlayer);
        pauseVideo(myiPhonePlayer);
        stopVideo(myiPhonePlayer);
        System.out.println("----Divider----");


        MusicBox myMusicBox = new MusicBox("Gasoline", false);
        runMusic(myMusicBox);
        pauseMusic(myMusicBox);
        stopMusic(myMusicBox);
    }

    public static void runVideo(VideoPlayer videoPlayer){
        videoPlayer.playVideo();
    }
    public static void pauseVideo(VideoPlayer videoPlayer) {videoPlayer.pauseVideo();}
    public static void stopVideo(VideoPlayer videoPlayer) {videoPlayer.stopVideo();}

    public static void runMusic(MusicPlayer musicPlayer){
        musicPlayer.playMusic();
    }
    public static void pauseMusic(MusicPlayer musicPlayer){musicPlayer.pauseMusic();}
    public static void stopMusic(MusicPlayer musicPlayer){musicPlayer.stopMusic();}
}
