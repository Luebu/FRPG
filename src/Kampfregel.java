public class Kampfregel{
    Wuerfel wuerfel6 = new Wuerfel(6);
    Wuerfel wuerfel10= new Wuerfel(10);
    public void kampf(Krieger k1, Monster k2){
        int dmg;
        System.out.println("Der Kampf beginnt. Dein Gegner hat "+k2.getLP()+" Leben");
        dmg=(k1.angriffswertBerechnen()+wuerfel10.wuerfeln()+wuerfel6.wuerfeln());
        System.out.println("Du greifst an und fügst deinem Gegner "+dmg+" Schaden zu");

    }
}
