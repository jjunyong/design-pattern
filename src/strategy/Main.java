package strategy;

public class Main{
    public static void main(String[] args){
        GameCharacter gameCharacter = new GameCharacter();
        gameCharacter.attack();  // 맨손 공격
        gameCharacter.setWeapon(new Knife());
        gameCharacter.attack(); // 칼로 찌르기
        gameCharacter.setWeapon(new ShotGun());
        gameCharacter.attack(); // 샷건 쏘기
    }
}