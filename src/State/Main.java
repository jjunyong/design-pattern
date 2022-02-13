package State;

import State.lightBulb.Freshman;

public class Main {
    public static void main(String[] args) {
        /* Light Bulb 예제 테스트 */
        Freshman freshman = new Freshman();
        freshman.lightChange(); // Off -> On
        freshman.lightChange(); // On -> Off

        /* Game 예제 테스트 */

    }
}
