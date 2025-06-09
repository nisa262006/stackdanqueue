public class demoTumpukan {
    public static void main (String[] args){
        tumpukan t = new tumpukan();

        barang komputer = new barang ("komputer");
        barang hp = new barang ("hp");
        barang tas = new barang ("tas");

        t.tumpuk(hp);
        t.tumpuk(tas);
        t.tumpuk(komputer);
        
        t.lihatIsiTumpukan();
    }
}
