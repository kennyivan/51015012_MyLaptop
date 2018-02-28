package com.example.a207_1.mylaptop;

/**
 * Created by 207-1 on 08/02/2018.
 */

public class Specification {
    private String processor;
    private String vga;
    private String ram;
    private String ssd;
    private String resolusi;
    private String id_item;
    private String nama;
    private String harga;

    protected String[][] data = new String[][]{
            {"00001","Razer Blade 14 Gaming RZ09","Rp 31.200.000","i7-7700HQ-2.8Ghz-3.8Ghz","NVIDIA GTX1060M-6GB","8GB DDR4 Single Channel","512GB SSD","1920 x 1080"},
            {"00002","ASUS ROG Gaming Laptop G752VS","Rp 26.999.000","i7-6700HQ-3.5GHz","NVIDIA GeForce GDDR5X GTX1070-8GB ","16GB DDR4 Dual Channel","None","1920 x 1080"},
            {"00003","MSI Laptop Gaming GE62 6QF Apache Pro 15.6","Rp 42.314.000","i7-6700HQ","NVIDIA GeForce GTX-970M 3GB","8GB DDR4 Single Channel","128GB SSD","1920 x 1080"}
    };

    public Specification(String id_item) {
        this.id_item = id_item;
        this.cariSpecification();

    }

    private void cariSpecification() {
        for(int i=0; i<this.data.length; i++){
            if (this.id_item.equals(this.data[i][0])){
                this.nama = this.data[i][1];
                this.harga = this.data[i][2];
                this.processor = this.data[i][3];
                this.vga = this.data[i][4];
                this.ram = this.data[i][5];
                this.ssd = this.data[i][6];
                this.resolusi = this.data[i][7];
            }
        }
    }


    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getVga() {
        return vga;
    }

    public void setVga(String vga) {
        this.vga = vga;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public String getResolusi() {
        return resolusi;
    }

    public void setResolusi(String resolusi) {
        this.resolusi = resolusi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getId_item() {
        return id_item;
    }

    public void setId_item(String id_item) {
        this.id_item = id_item;
    }

}
