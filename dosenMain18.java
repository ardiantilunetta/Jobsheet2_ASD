public class dosenMain18 {
    public static void main(String[] args) {

        dosen18 dsn1 = new dosen18();
        dsn1.idDosen = "D001";
        dsn1.nama = "Budi Santoso";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2015;
        dsn1.bidangKeahlian = "Pemrograman";

        dsn1.tampilInformasi();
        dsn1.setStatusAktif(false);
        System.out.println("Masa Kerja: " + dsn1.hitungMasaKerja(2026) + " tahun");
        dsn1.ubahKeahlian("Basis Data");
        dsn1.tampilInformasi();
        
        dosen18 dsn2 = new dosen18(
                "D002",
                "Siti Aisyah",
                true,
                2018,
                "Jaringan Komputer"
        );

        dsn2.tampilInformasi();
        dsn2.setStatusAktif(true);
        System.out.println("Masa Kerja: " + dsn2.hitungMasaKerja(2026) + " tahun");
        dsn2.ubahKeahlian("Keamanan Jaringan");
        dsn2.tampilInformasi();
    }
}