package singleton;

public class Main {
    public static void main(String[] args) {
        Settings setting1 = Settings.getSettings();
        Settings setting2 = Settings.getSettings();

        //싱글톤 패턴으로 구현된 클래스의 2개의 객체를 선언하여 getInstance 메소드를 통해 초기화 해주면 동일한 인스턴스임을 알 수 있다. 결과값 : true
        System.out.println(setting1 == setting2);
    }
}
