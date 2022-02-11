package singleton;

public class Settings {
    private static Settings settings;
    private Settings(){}
    public static Settings getSettings(){
        if( settings == null ){
            settings = new Settings();
        }
        return settings;
    }

    private boolean darkMode = false;
    private int fontSize = 10;
    private String fontColor = "black";
}

/* 아래는 Multi thread 환경에서의 싱글톤 패턴 - 클래스타입의 static 변수 선언과 동시에 초기화 해주기 getSettings에 여러 쓰레드가 접근 하여
 객체 생성을 경쟁할 것에 대한 방지 */
/*
public class Settings{
    private static Settings settings = new Settings();
    private Settings(){}
    public static Settings getSettings(){
        return settings;
    }
    private boolean darkMode = false;
    private int fontSize = 10;
    private String fontColor = "black";
}
*/
