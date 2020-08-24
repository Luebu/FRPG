public class Main {
    public static void main(String[] args) {
        Krieger k1 = new Krieger(10,0,100);
        Monster m1 = new Monster();
        Kampfregel kampf = new Kampfregel();
        kampf.kampf(k1, m1);

    }
}
