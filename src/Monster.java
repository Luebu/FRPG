public class Monster {

    private int angriffswert;
    private int lebenspunkte;

    Monster(){
        lebenspunkte=(int)(Math.random()*75)+25;
        angriffswert=(int)(Math.random()*20)+10;
    }

    public int getAngriffswert() {
        return angriffswert;
    }

    public void setAngriffswert(int angriffswert) {
        this.angriffswert = angriffswert;
    }

    public void recieveDamage(int pDmg){
        if(lebenspunkte-pDmg>0){
            lebenspunkte=lebenspunkte-pDmg;
        }else{
            System.out.println("YOU DIED");
            System.exit(1);
        }
    }
    public int getLP(){
        return lebenspunkte;
    }
}