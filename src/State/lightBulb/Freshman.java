package State.lightBulb;

public class Freshman {

    private LightBulbState lightBulbState = new LightOffState();

    public void setState(LightBulbState lightBulbState) {
        this.lightBulbState = lightBulbState;
    }

    public void lightChange(){
        lightBulbState.doState(this);
    }
}
