package Polymorphism.home_work;

public class VolumeCalculator {
    void volume(int side){
        System.out.println("Volume of Cube : "+side*side*side);
    }
    void volume(int length,int breath,int height){
        System.out.println("volume of Cuboid : "+length*breath*height);
    }
    void volume(double radius,double height){
        System.out.println("Volume of Cylinder : "+3.143*radius*height*radius);
    }
    public static void main(String[] args){
        VolumeCalculator v = new VolumeCalculator();
        v.volume(4);
        v.volume(5,10);
        v.volume(5,5,5);
    }
}
