package State.lightBulb;

public class LightOffState implements LightBulbState {
    @Override
    public void doState(Freshman freshman){
        System.out.println("전구가 꺼져있음");
        freshman.setState(new LightOnState());
    }
}
