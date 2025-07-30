package Abstract.practice;

abstract class music {
    abstract void playSong(String name);
}
class spotify extends music{
    void pause(){
        System.out.println("Paused the Song ");
    }
    void playSong(String name){
        System.out.println("I'm Playing song on Spotify "+name);
    }
    public static void main(String[] args){
        spotify s = new spotify();
        s.pause();
        s.playSong("Sayaira");
    }
}
