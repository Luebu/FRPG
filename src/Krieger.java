public class Krieger extends Held {


    Krieger(int pStaerke, int pAngriffswert, int pLebenspunkte) {
        super(pStaerke, pAngriffswert, pLebenspunkte);

    }

    public int angriffswertBerechnen() {
        int ausdauer = 20;
        return (getWaffe().bonusBerechnen() + getStearke()) + ausdauer;
    }
}