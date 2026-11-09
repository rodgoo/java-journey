package advanced_oop.interfaces.MusicPlayer;

public class MusicBoxClass implements MusicPlayer {


    @Override
    public void playMusic() { System.out.println("A caixa de música está reproduzindo a música"); }

    @Override
    public void pauseMusic() { System.out.println("A caixa de música pausou a música"); }

    @Override
    public void stopMusic() { System.out.println("A caixa de música parou a música"); }
}
