package adapter_ex1.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playMp4(String filename) {
        System.out.println("Playing vlc file. \nName: " + filename);
    }

    @Override
    public void playVlc(String filename) {
        // do nothing
    }
    
}
