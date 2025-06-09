public class pembeli {
    String nama;
    pembeli berikutnya;

    public pembeli (String n){
        this.nama = n;
        this.berikutnya = null;
    }
    public String getNama(){
        return nama;
    }
    @Override
    public String toString(){
        return nama;
    }
}
