public class Main {
    public static void main(String[] args) {
        Krieger k1 = new Krieger(10,0,100);
        Monster m1 = new Monster();
        Kampfregel kampf = new Kampfregel();
       // System.out.println(k1.angriffswertBerechnen());
        kampf.kampf(k1, m1);

    }
}
