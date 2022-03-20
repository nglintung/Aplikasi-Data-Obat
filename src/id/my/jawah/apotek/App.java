package id.my.jawah.apotek;

import javax.swing.JFrame;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame( "Hello, Java!" );
        frame.setSize( 300, 300 );
        frame.setVisible( true );
        Item obat1 = new Item();
        obat1.setNamaItem("Novaxicam");
        System.out.println(obat1.getStokItem());
        obat1.kurangiStock((short) 5);
        System.out.println(obat1.getStokItem());
        obat1.tambahStock((short) 15);
        System.out.println(obat1.getStokItem());

    }
}