interface Playable{
    void play();
    void stop();
}

class AudioFile implements Playable{
    @Override
    public void play() {
        System.out.println("Playing audio");
    }

    @Override
    public void stop() {
        System.out.println("Audio stopped");
    }
}

class VideoFile implements Playable{
    @Override
    public void play() {
        System.out.println("Playing video");
    }

    @Override
    public void stop() {
        System.out.println("Video stopped");
    }
}

public class MediaPlayer {
    public static void main(String[] args){
        Playable[] files = new Playable[2];

        files[0] = new AudioFile();
        files[1] = new VideoFile();

        for (int i=0; i<files.length; i++){
            files[i].play();
            files[i].stop();
        }
    }

}
