package Greenest;


public interface LiquidNeed {
    double calculateNeed();
    LiquidForm getLiquid();
}
/*eftersom detta är en interface så implementeras alla metoder till klasserna som har implement av LiquidNeed
Varje klass har en eget räkna sätt med calculateNeed och returneras i double

LiquidForm returnerar vätskan växten behöver.

Och allt detta görs även om det är från olika klasser men som har implementerat detta
Räknas som polymorfism*/
