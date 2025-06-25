public class demoAntrian {
    public static void main (String []args){
        antrian a = new antrian();


        System.out.println("\n---menambah pengantri----");
        //nambah antrian
        pembeli p1 = new pembeli ("nisa");
        a.tembahPengantri(p1);
        System.out.println(p1.getNama() +"masuk antrian");

        pembeli p2 = (new pembeli("Amanda"));
        a.tembahPengantri(p2);
        System.out.println(p2.getNama() +"masuk antrian.");
        pembeli p3 = (new pembeli("Tiara"));
        a.tembahPengantri(p3);
        System.out.println(p3.getNama() +"masuk antrian.");
        pembeli p4 = (new pembeli("Sabrina"));
        a.tembahPengantri(p4);
        System.out.println(p4.getNama() +"masuk antrian.");

        //meriksa antrian setelah nambah
        System.out.println("\nAntrian sekarang kosong?" + a.habiskah());

        //melihat siapa yang paling depan
        System.out.println("\n---melihat pengantri terdepan---");
        pembeli terdepanSekarang = a.terdepan();
        if (terdepanSekarang != null){
            System.out.println("pembeli terdepan:" + terdepanSekarang.getNama());
        }else{
            System.out.println("antrian kosong, tidak ada pembeli");
        }
        System.out.println("\n--melayani pengantri---");
        pembeli yangDilayani;

        //melayani pembeli pertama
        yangDilayani = a.layani();
        if (yangDilayani != null){
            System.out.println("melayani:" + yangDilayani.getNama());
        }
        //cek pembeli terdepan
        terdepanSekarang = a.terdepan();
        if(terdepanSekarang != null){
            System.out.println("pembeli terdepan:" +terdepanSekarang.getNama());
        }else{
            System.out.println("antrian sudah kosong.");
        }

        System.out.println("\nmelanjutkan layani hingga kosong");
        while (!a.habiskah()){
            yangDilayani = a.layani();
            if (yangDilayani != null){
                System.out.println("melayani:" + yangDilayani.getNama());
            }
        }

        System.out.println("\n---menambah pengantri---");
        a.tembahPengantri(new pembeli("Ainun"));
        System.out.println("pembeli terdepan:" + a.terdepan().getNama());

    }
}
