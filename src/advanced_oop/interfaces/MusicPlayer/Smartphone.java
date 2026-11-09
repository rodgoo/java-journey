package advanced_oop.interfaces.MusicPlayer;

public class Smartphone implements VideoPlayer, MusicPlayer {


    @Override
    public void playVideo() { System.out.println("[smartphone] The smartphone's playing the video"); }

    @Override
    public void pauseVideo() { System.out.println("[smartphone] The smartphone's paused the video"); }

    @Override
    public void stopVideo() { System.out.println("[smartphone] The smartphone's stopped the video"); }

    @Override
    public void playMusic() { System.out.println("[smartphone] The smartphone's playing the music"); }

    @Override
    public void pauseMusic() { System.out.println("[smartphone] The smartphone's paused the music"); }

    @Override
    public void stopMusic() { System.out.println("[smartphone] The smartphone's stopped the music"); }
}
