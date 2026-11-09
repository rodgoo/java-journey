package advanced_oop.interfaces.MusicPlayer;

public class Computer implements VideoPlayer, MusicPlayer {


    @Override
    public void playVideo() {
        System.out.println("[computer] The computer's playing the video");
    }

    @Override
    public void pauseVideo() { System.out.println("[computer] The computer's paused the video"); }

    @Override
    public void stopVideo() {
        System.out.println("[computer] The computer's stopped the video");
    }

    @Override
    public void playMusic() { System.out.println("[computer] The computer's playing the music"); }

    @Override
    public void pauseMusic() { System.out.println("[computer] The computer's paused the music"); }

    @Override
    public void stopMusic() { System.out.println("[computer] The computer's stopped the music"); }
}
