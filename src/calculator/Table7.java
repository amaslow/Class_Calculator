package calculator;


public class Table7 extends CCalculator {
//    Lamp type | Correction factor
//  ------------|-------------------
//      HAL     |    1
//      CFL     |    1,08
//      LED     |    1 + 0.5 * (1 - llmf)

    public double corrfactorHAL() {
        return 1.00;
    }

    public double corrfactorCFL() {
        return 1.08;
    }

    public double corrfactorLED(double llmf) {
    
        return (1 + 0.5 * (1 - llmf));
    }
}
