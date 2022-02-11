package strategy;

public class ShotGun implements Weapon{
    @Override
    public void attack(){
        System.out.println("샷건 쏘기");
    }
}
