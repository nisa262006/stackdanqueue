public class antrian {
    pembeli depan;
    pembeli belakang;

    //push
    public void tembahPengantri (pembeli p){
        if(habiskah()){
            depan = p;
            belakang = p;
        }else {
            belakang.berikutnya = p;
            belakang = p;
        }
        p.berikutnya = null;
    }

    //pop
    public pembeli layani(){
        if (habiskah()){
            System.out.println("antrian kosong, tidak ada pembeli");
            return null;
        }
        pembeli yangDilayani = depan;
        depan = depan.berikutnya;

        if (depan == null){
            belakang = null;
        }
        return yangDilayani;
    }

    //peek
    public pembeli terdepan(){
        if (habiskah()){
            System.out.println("antrian kosong");
            return null;
        }
        return depan;
    }

    //isempty
    public boolean habiskah(){
        return depan == null;
    }
}
