package pkg22205043.pbo.lat59;

class Tokoh {

    protected String nama;
    protected String peran;

    public Tokoh(String nama, String peran) {
        this.nama = nama;
        this.peran = peran;
    }

    public String getNama() {
        return nama;
    }

    public String getPeran() {
        return peran;
    }
}

class TokohUtama extends Tokoh {

    private String tim;

    public TokohUtama(String nama, String peran, String tim) {
        super(nama, peran);
        this.tim = tim;
    }

    public String getTim() {
        return tim;
    }

    public void tampilTokohUtama() {
        System.out.println("Nama Tokoh : " + getNama());
        System.out.println("Peran: " + getPeran());
        System.out.println("Tim: " + getTim() + "\n");
    }

}

class TokohPendukung extends Tokoh {

    private String hubungan;

    public TokohPendukung(String nama, String peran, String hubungan) {
        super(nama, peran);
        this.hubungan = hubungan;
    }

    public String getHubungan() {
        return hubungan;
    }

    public void tampilTokohPendukung() {
        System.out.println("Nama Tokoh : " + getNama());
        System.out.println("Peranan sebagai : " + getPeran());
        System.out.println("Hubungan dengan Tokoh Utama : " + getHubungan());
        System.out.println("");
    }

}

public class PBOLat59 {

    public static void main(String[] args) {
        TokohUtama conan = new TokohUtama("Shinichi Kudo/Conan Edogawa",
                "Detektif", "Detektif Cilik");
        conan.tampilTokohUtama();

        TokohUtama ran = new TokohUtama("Ran Mouri", "Ketua klub karate",
                "Tidak bergabung dengan tim, tetapi sering membantu tim detektif cilik");
        ran.tampilTokohUtama();

        TokohUtama kogoro = new TokohUtama("Kogoro Mouri", "Detektif Swasta",
        "Detektif Cilik");
        kogoro.tampilTokohUtama();

        TokohPendukung sonoko = new TokohPendukung("Sonoko Suzuki",
                "remaja perempuan biasa yang centil dan suka mencari perhatian remaja laki-laki yang menarik",
                "Sahabat Ran");
        sonoko.tampilTokohPendukung();

        TokohPendukung genta = new TokohPendukung("Genta Kojima",
                "pendiri Grup Detektif Cilik", "teman dari Shinichi Kudo/Conan Edogawa");
        genta.tampilTokohPendukung();

        TokohPendukung mitsuhiko = new TokohPendukung("Mitsuhiko Tsuburaya",
                "Seorang anggota Grup Detektif Cilik", "Teman dari Shinichi Kudo");
        mitsuhiko.tampilTokohPendukung();

        TokohPendukung eri = new TokohPendukung("Eri Kisaki",
                "Seorang pengacara (Ratu Pengacara)", "Ibu dari Ran Mouri");
        eri.tampilTokohPendukung();

        TokohPendukung kazuha = new TokohPendukung("Kazuha Toyama",
                "Ahli alkido", "Teman dekat dengan Ran Mouri");
        kazuha.tampilTokohPendukung();

        TokohPendukung heiji = new TokohPendukung("Heiji Hattori",
                "Ahli menyelidiki kasus dan petarung kendo",
                "Teman dekat dengan Conan Edogawa/ Shinich");
        heiji.tampilTokohPendukung();

        TokohPendukung ai = new TokohPendukung("Ai Haibara",
                "Seorang anggota Organisasi Berbaju Hitam yang berkhianat",
                "Teman dari Conan Edogawa");
        ai.tampilTokohPendukung();
        
        TokohPendukung hiroshi = new TokohPendukung("Hiroshi Agasa",
                "Seorang profesor linglung yang menemukan beberapa perangkat untuk membantu Conan",
                "Dia sering membantu Grup Detektif");
        hiroshi.tampilTokohPendukung();
        
        TokohPendukung ayumi = new TokohPendukung("Ayumi Yoshida",
                "anggota Grup Detektif Cilik", "teman Conan");
        ayumi.tampilTokohPendukung();

    }
}