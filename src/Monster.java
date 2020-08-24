public class Monster {

    private int angriffswert;
    private int lebenspunkte;

    Monster() {
        lebenspunkte = (int) (Math.random() * 75) + 75;
        angriffswert = (int) (Math.random() * 20) + 27;
    }

    public int getAngriffswert() {
        return angriffswert;
    }

    public void setAngriffswert(int angriffswert) {
        this.angriffswert = angriffswert;
    }

    public void recieveDamage(int pDmg) {
        if (lebenspunkte - pDmg > 0) {
            lebenspunkte = lebenspunkte - pDmg;
        } else {
            System.out.println("Du hast Gewonnen!!");
            System.exit(1);
        }
    }

    public int getLP() {
        return lebenspunkte;
    }
}