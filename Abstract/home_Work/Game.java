package Abstract.home_Work;

abstract class Game {
    abstract void play();
    void start(){
        System.out.println("Game Started !! ");
    }
}
class Cricket extends Game{
    void play(){
        System.out.println("Let's Play The Cricket !! ");
    }
}
class Chess extends Game{
    void play(){
        System.out.println("Lets's Play the Chess !!! ");
    }
    public static void main(String[] args){
        Cricket c = new Cricket();
        c.play();
        c.start();
        Chess ch = new Chess();
        ch.play();
        ch.start();
    }
}
