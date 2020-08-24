public class Held {

    private Waffe meineWaffe=new Waffe();
    String name;
    private int staerke;
    private int angriffswert;
    private int lebenspunkte;

    Held (int pStaerke,int pAngriffswert, int pLebenspunkte){
        staerke= pStaerke;
        angriffswert= pAngriffswert;
        lebenspunkte= pLebenspunkte;


    }

    public int angreifen(Monster g, Kampfregel r){

        return 0;
    }
    public Waffe getWaffe(){
        return meineWaffe;
    }
    public int angriffswertBerechnen(){
        return 0;
    }

    public String getName(){
        return name;
    }
    public void setName(String pName){
        name=pName;
    }

    public int getStearke(){
        return staerke;
    }
    public void setStearke(int pStearke){
        staerke=pStearke;
    }

    public int getAngriffswert(){
        return angriffswert;
    }

    public int getLebenspunkte(){
        return lebenspunkte;
    }
    public void setLebenspunkte(int pLp){
        lebenspunkte=pLp;
    }
}
