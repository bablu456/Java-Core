package Abstract.home_Work;

interface MusicPlayer {
    void playSong(String name);
}
class SpotifyPlayer implements MusicPlayer{
  public void playSong(String name){
      System.out.println("I'm Playing this Song on Spotify Song name : "+name);
    }
    void pause(){
        System.out.println("I'm Pausing the song !! ");
    }
}
class LocalPlayer implements MusicPlayer{
    public void playSong(String name){
        System.out.println("i'm Playing this song on Local Player Song name : "+name);
    }
    void pause(){
        System.out.println("i'm Pausing the song !! ");
    }
    public static void main(String[] args){
        SpotifyPlayer sp = new SpotifyPlayer();
        sp.playSong("Banjara");
        sp.pause();
        LocalPlayer lp = new LocalPlayer();
        sp.playSong("Karma");
        sp.pause();
    }
}
