public class Krieger extends Held{


    private int ausdauer;
    Krieger(int pStaerke, int pAngriffswert, int pLebenspunkte){
        super(pStaerke,pAngriffswert,pLebenspunkte);

    }

    public int angriffswertBerechnen(){
        return (getWaffe().bonusBerechnen()+getStearke())*ausdauer;
    }
}