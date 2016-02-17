
class Table8 {
//    LED Lamp beam angle       | Luminous flux multiplication factor
//  ----------------------------|-------------------------------------
//    20deg =< beam angle       |    1
//  15deg =< beam angle < 20deg |    0,9
//  10deg =< beam angle < 15deg |    0,85
//      beam angle < 10deg      |    0,80
    
    public double corrfactorLED(int angle) {
        if (angle < 10) {
            return 0.80;
        } else if (angle >= 10 && angle < 15) {
            return 0.85;
        } else if (angle >= 15 && angle < 20) {
            return 0.90;
        } else if (angle >= 20) {
            return 1.00;
        }
        return 0;
    }
}
