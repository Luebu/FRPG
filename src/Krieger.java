public class Krieger extends Held {


    private final int ausdauer = 20;

    Krieger(int pStaerke, int pAngriffswert, int pLebenspunkte) {
        super(pStaerke, pAngriffswert, pLebenspunkte);

    }

    public int angriffswertBerechnen() {
        return (getWaffe().bonusBerechnen() + getStearke()) + ausdauer;
    }
}