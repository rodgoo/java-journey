package advanced_oop.interfaces.MusicPlayer;

public record MusicBox(String music, boolean isPaused) implements MusicPlayer {

    // Public abstract methods
    @Override
    public void playMusic() {
        System.out.println("[music box] Listening to: " + music);
    }

    @Override
    public void pauseMusic() {
        System.out.println("[music box] " + music + " was paused");
    }

    @Override
    public void stopMusic() {
        System.out.println("[music box] " + music + " was stopped");
    }
}
