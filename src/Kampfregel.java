public class Kampfregel{
    Wuerfel wuerfel6 = new Wuerfel(6);
    Wuerfel wuerfel10= new Wuerfel(10);
    public void kampf(Krieger k1, Monster k2){
        int dmg;
        System.out.println("Der Kampf beginnt. Dein Gegner hat "+k2.getLP()+" Leben");
        dmg=(k1.angriffswertBerechnen()+wuerfel10.wuerfeln()+wuerfel6.wuerfeln());
        System.out.println("Du greifst an und fügst deinem Gegner "+dmg+" Schaden zu");
        k2.recieveDamage(dmg);
        while(k2.getLP()>0){
            System.out.println("Dein Gegner hat noch "+k2.getLP()+" Leben");
            dmg=k2.getAngriffswert()+ wuerfel6.wuerfeln()+wuerfel10.wuerfeln();
            System.out.println("Du erhälst "+ dmg+" Schaden");
            k1.recieveDamage(dmg);

            System.out.println("Du hast noch "+k1.getLebenspunkte()+" Leben");

            System.out.println("Dein Gegner hat noch "+k2.getLP()+" Leben");
            dmg=(k1.angriffswertBerechnen()+wuerfel10.wuerfeln()+wuerfel6.wuerfeln());
            System.out.println("Du greifst an und fügst deinem Gegner "+dmg+" Schaden zu");
            k2.recieveDamage(dmg);
        }
    }
}
