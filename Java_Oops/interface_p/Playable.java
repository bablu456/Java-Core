package Java_Oops.interface_p;

 interface Playable {
    void play();
}
class MusicPlayer implements Playable{
    public void play(){
        System.out.println("Playing music file !! ");
    }
}
class VideoPlayer implements  Playable{
     public void play(){
         System.out.println("Playing Video file !! ");
     }
}
class Play  implements Playable{
     public void play(){
         System.out.println("Playing videos  ");
     }
     public static void main(String[] args){
         Playable[] mediList = new Playable[3];
         mediList [0] = new MusicPlayer();
         mediList [1] = new VideoPlayer();
         mediList [2] = new Play();
         for(Playable item:mediList){
             item.play();
         }
     }
}
