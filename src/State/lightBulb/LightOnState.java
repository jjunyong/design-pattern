package State.lightBulb;

public class LightOnState implements LightBulbState{
    @Override
    public void doState(Freshman freshman){
        System.out.println("전구가 반짝반짝");
        freshman.setState(new LightOffState());
    }
}
