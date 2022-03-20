package id.my.jawah.apotek;

public class Item {
    private String namaItem;
    private Short kodeItem;
    private String jenisItem;
    private String satuanItem;
    private Short hargaPokok;
    private Short hargaJual;
    private Short stokItem;
    
    public Item(String namaItem, Short kodeItem, String jenisItem, String satuanItem, Short hargaPokok, Short hargaJual,
            Short stokItem) {
        this.namaItem = namaItem;
        this.kodeItem = kodeItem;
        this.jenisItem = jenisItem;
        this.satuanItem = satuanItem;
        this.hargaPokok = hargaPokok;
        this.hargaJual = hargaJual;
        this.stokItem = stokItem;
    }

    public Item(String namaItem, Short kodeItem, String jenisItem, String satuanItem) {
        this.namaItem = namaItem;
        this.kodeItem = kodeItem;
        this.jenisItem = jenisItem;
        this.satuanItem = satuanItem;
    }

    public Item() {
        this.namaItem = "Paracetamol Contoh";
        this.kodeItem = 1221;
        this.jenisItem = "Obat bebas";
        this.satuanItem = "Tab";
        this.hargaPokok = 1800;
        this.hargaJual = 5000;
        this.stokItem = 10;
    }

    
    public String getNamaItem() {
        return namaItem;
    }

    public void setNamaItem(String namaItem) {
        this.namaItem = namaItem;
    }

    public Short getKodeItem() {
        return kodeItem;
    }

    public void setKodeItem(Short kodeItem) {
        this.kodeItem = kodeItem;
    }

    public String getJenisItem() {
        return jenisItem;
    }

    public void setJenisItem(String jenisItem) {
        this.jenisItem = jenisItem;
    }

    public String getSatuanItem() {
        return satuanItem;
    }

    public void setSatuanItem(String satuanItem) {
        this.satuanItem = satuanItem;
    }

    public Short getHargaPokok() {
        return hargaPokok;
    }

    public void setHargaPokok(Short hargaPokok) {
        this.hargaPokok = hargaPokok;
    }

    public Short getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(Short hargaJual) {
        this.hargaJual = hargaJual;
    }

    public Short getStokItem() {
        return stokItem;
    }

    public void setStokItem(Short stokItem) {
        this.stokItem = stokItem;
    }

    @Override
    public String toString() {
        return "Item [hargaJual=" + hargaJual + ", hargaPokok=" + hargaPokok + ", jenisItem=" + jenisItem
                + ", kodeItem=" + kodeItem + ", namaItem=" + namaItem + ", satuanItem=" + satuanItem + ", stokItem="
                + stokItem + "]";
    }

    public void kurangiStock(Short kurangiStock){
        Short stokUpdate = (short) (getStokItem() - kurangiStock);
        setStokItem(stokUpdate);
    }
    
    public void tambahStock(Short kurangiStock){
        Short stokUpdate = (short) (getStokItem() + kurangiStock);
        setStokItem(stokUpdate);
    }
}