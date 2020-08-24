public class Wuerfel{
    int anzahlSeiten;

    Wuerfel(int pZ){
        anzahlSeiten=pZ;
    }
    public int wuerfeln(){
        return (int)(Math.random()*anzahlSeiten);
    }
}
