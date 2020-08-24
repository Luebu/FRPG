public class Held {
    String name;
    private Waffe meineWaffe = new Waffe();
    private int staerke;
    private int angriffswert;
    private int lebenspunkte;

    Held(int pStaerke, int pAngriffswert, int pLebenspunkte) {
        staerke = pStaerke;
        angriffswert = pAngriffswert;
        lebenspunkte = pLebenspunkte;


    }

    public void recieveWeapon() {

        meineWaffe.setMat("Diamant");
    }

    public int angreifen(Monster g, Kampfregel r) {

        return 0;
    }

    public Waffe getWaffe() {
        return meineWaffe;
    }

    public String getName() {
        return name;
    }

    public void setName(String pName) {
        name = pName;
    }

    public int getStearke() {
        return staerke;
    }

    public void setStearke(int pStearke) {
        staerke = pStearke;
    }

    public int getAngriffswert() {
        return angriffswert;
    }

    public int getLebenspunkte() {
        return lebenspunkte;
    }

    public void setLebenspunkte(int pLp) {
        lebenspunkte = pLp;
    }

    public void recieveDamage(int pDmg) {
        if (lebenspunkte - pDmg > 0) {
            lebenspunkte = lebenspunkte - pDmg;
        } else {
            System.out.println("YOU DIED");
            System.exit(1);
        }
    }
}
