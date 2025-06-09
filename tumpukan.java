public class tumpukan {
    barang palingAtas;

    public void tumpuk (barang n){
        n.dibawahnya = palingAtas;
        palingAtas = n;
    }

    public void lihatIsiTumpukan(){
        if(palingAtas == null){
            System.out.println("tumpukan kosong");
            return;
        }

        barang sekarang = palingAtas;
        System.out.println("barang :" +sekarang.nama);

        while (sekarang.dibawahnya != null){
            sekarang = sekarang.dibawahnya;
            System.out.println("barang:" +sekarang.nama);
        }
    }

    // pop
    public barang ambil(){
        barang Atas = palingAtas;
        palingAtas = Atas.dibawahnya;
        return null;
    }
    
    
    public barang lihatPalingAtas(){
        return null;
    }
}
