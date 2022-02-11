package strategy;

public class GameCharacter {

    private Weapon weapon;
    GameCharacter(){}

    public void setWeapon(Weapon _weapon){
        this.weapon = _weapon;
    }
    public void attack(){
        if(this.weapon == null){
            System.out.println("맨손 공격");
        }
        else {
            weapon.attack();
        }
    }



}
