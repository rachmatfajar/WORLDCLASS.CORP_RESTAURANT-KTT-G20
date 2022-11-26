package proses;

 //membuat class dengan nama pelanggan 
 //dengan menggunakan modifier private pada variable nya
public class Pelanggan {
    private String nama;
    private int nomorMeja;

    // membuat method pelanggan dengan nilai awal default dan 0
    public Pelanggan() {
        nama = "default";
        nomorMeja = 0;
    }
    
    // menggunakan construktor dengan parameter,
    //String nama dan int nomorMeja
    public Pelanggan(String nama, int nomorMeja) {
        this.nama = nama;
        this.nomorMeja = nomorMeja;
    }
    // fungsi getter
    public String getNama() {
        return this.nama;
    }
    // fungsi getter
    public int getNomorMeja() {
        return this.nomorMeja;
    }
    // fungsi setter
    public void setNama(String nama) {
        this.nama = nama;
    }
    // fungsi setter
    public void setNomorMeja(int nomorMeja) {
        this.nomorMeja = nomorMeja;
    }
}
