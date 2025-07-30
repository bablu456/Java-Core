package Abstract.practice;

abstract class game {
    void start(){
        System.out.println("Game Started !!! ");
    }
    abstract void play();
}
class Cricket extends game{
    void play(){
        System.out.println("Playing Cricket !! ");
    }
    public static void main(String[] args){
        Cricket cr = new Cricket();
        cr.start();
        cr.play();
    }
}

