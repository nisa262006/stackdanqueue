public class demoAntrianPendaftaran {
    public static void main(String[] args) {
        System.out.println("simulasi antrian pendaftaran mahasiswa");
        System.out.println("================================");

        //objek antrian
        antrianPendaftaran antrianMaba = new antrianPendaftaran();

        System.out.println("\n---tahap pendaftaran---");
        antrianMaba.push(new mahasiswa("Rahma"));
        antrianMaba.push(new mahasiswa("Fitria"));
        antrianMaba.push(new mahasiswa("AMANDA"));
        antrianMaba.push(new mahasiswa("Sabrina"));

        System.out.println("\n---pemeriksaan awal---");
        antrianMaba.empty();

        System.out.println("\n---tahap panggilan calon mahasiswa");
        antrianMaba.peek();
        System.out.println("proses: " + antrianMaba.pop().getNama() +"selesai dipanggil.");
        System.out.println("proses: " + antrianMaba.pop().getNama() +"selesai dipanggil.");
        System.out.println("proses: " + antrianMaba.pop().getNama() +"selesai dipanggil.");
        System.out.println("proses: " + antrianMaba.pop().getNama() +"selesai dipanggil.");

        System.out.println("\n---pendaftaran selanjutnya---");
        antrianMaba.push(new mahasiswa("AINUN"));
        antrianMaba.push(new mahasiswa("TIARA"));

        System.out.println("\n---tehap panggilan maba tahap2");
        System.out.println("proses: " + antrianMaba.pop().getNama() +"selesai dipanggil.");
        System.out.println("proses: " + antrianMaba.pop().getNama() +"selesai dipanggil.");

        System.out.println("\n--pemeriksaan akhir antrian---");
        antrianMaba.empty();

        System.out.println("\n---coba memanggil antrian yang kosong");
        try {
            antrianMaba.pop();
        } catch (IllegalStateException e) {
            System.out.println("peringatan: " + e.getMessage());
        }
    }
}
