package id.my.jawah.apotek;

public class App {
    public static void main(String[] args) {
        Item obat1 = new Item();
        obat1.setNamaItem("Novaxicam");
        System.out.println(obat1);
        obat1.kurangiStock((short) 10);
        System.out.println(obat1);

    }
}