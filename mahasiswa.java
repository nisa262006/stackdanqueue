public class mahasiswa {
    private String nama;

    public mahasiswa(String nama){
        this.nama = nama;
    }

    //untuk mendapatkan nama
    public String getNama(){
        return nama;
    }

    @Override
    public String toString(){
        return nama;
    }
}
