import java.util.Stack;
//membuat 2 tumpukan dengan Stick

public class antrianPendaftaran {
    private Stack<mahasiswa> mejaPendaftaran;
    private Stack<mahasiswa> mejaPanggilan;

    //membuat antrian baru
    public antrianPendaftaran(){
        mejaPendaftaran = new Stack();
        mejaPanggilan = new Stack();

    }

    
    //menambahkan mahasiswa ke  antrian (push)
    public void push (mahasiswa calonMahasiswa){
        mejaPendaftaran.push(calonMahasiswa);
        System.out.println("[DAFTAR]" + calonMahasiswa.getNama()+ " telah mendaftar.");
    }

    //memanggil dan menghapus mahasiswa terdepan (pop)
    public mahasiswa pop(){
        if(mejaPanggilan.empty()){
            pindahkanDokumenUntukPanggilan();
        }

        if(mejaPanggilan.empty()){
            throw new IllegalStateException("antrian pendaftaran kosong");
        }

        mahasiswa dipanggil = mejaPanggilan.pop();
        System.out.println("[PANGGIL]" + dipanggil.getNama() + "dipanggil");
        return dipanggil;
    }

    //melihat antrian depan tanpa menghapus antrian
    public mahasiswa peek(){
        if(mejaPanggilan.empty()){
            pindahkanDokumenUntukPanggilan();
        }
        if(mejaPanggilan.empty()){
            throw new IllegalStateException("antrian pendaftaran kosong");
        }

        mahasiswa terdepan = mejaPanggilan.peek();
        System.out.println("[LIHAT Calon Mahasiswa Terdepan]" + terdepan.getNama());
        return terdepan;
    }

    //memeriksa antrian kosong
    public boolean empty(){
        boolean kosong = mejaPendaftaran.empty() && mejaPanggilan.empty();
        System.out.println("[STATUS] antrian kosong?" + kosong);
        return kosong;
    }

    //metode pembantu untuk pindahkan dokumen
    private void pindahkanDokumenUntukPanggilan(){
        System.out.println("---petugas memindahkan dokumen ke meja panggilan---");
        while (!mejaPendaftaran.empty()){
            mejaPanggilan.push(mejaPendaftaran.pop());
        }
    }
}
