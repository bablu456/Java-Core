package Abstract.home_Work;

abstract class MediaPlayer {
    String filenName;
    MediaPlayer(String filenName){
        this.filenName = filenName;
    }
    abstract void play();
}
class AudioPlayer extends MediaPlayer{
    AudioPlayer(String filename){
        super(filename);
    }
    void play(){
        System.out.print("Playing Audio : "+filenName);
    }
}
class VideoPlayer extends MediaPlayer{
    VideoPlayer(String filename){
        super(filename);
    }
    void play(){
        System.out.print("Playing Video : "+filenName);
    }
    public static void main(String[] args){
        AudioPlayer ad = new AudioPlayer("Song.Mp3");
        ad.play();
        VideoPlayer vd = new VideoPlayer("Movies.Mp4");
        vd.play();
    }
}
