package larimahasiswa;
public class Mahasiswa {
    int panjang, lebar;
   
    public int Lapangan(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        return 0;
    }
    
    public int getUkuranlapangan() {
        return (2*(panjang+lebar))*jumlahPutaran;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    
    
    String nama, nim;
    int jumlahPutaran, jumlahWaktu;
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public void setjumlahPutaran(int jumlahPutaran){
        this.jumlahPutaran = jumlahPutaran;
    }
    public void setjumlahWaktu(int jumlahWaktu){
        this.jumlahWaktu = jumlahWaktu;
    }

    public int getJumlahPutaran() {
        return jumlahPutaran;
    }

    public int getJumlahWaktu() {
        return jumlahWaktu;
    }
    public double hitungCepat(){
        return (double)jumlahPutaran/jumlahWaktu;
    }
   public boolean perbadinganCepat(Mahasiswa r){
       return (hitungCepat()>r.hitungCepat());
   }
    public void displayEnd(){
        System.out.println("###Output###");
        System.out.print(nama+" ");
        System.out.println(getUkuranlapangan());
        System.out.println(hitungCepat());
        
    }

}