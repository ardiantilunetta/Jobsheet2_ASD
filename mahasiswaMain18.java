public class mahasiswaMain18 {
    public static void main(String[] args) {
        mahasiswa18 mhs1 = new mahasiswa18();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK(3.60);
        mhs1.tampilkanInformasi();

        mahasiswa18 mhs2 = new mahasiswa18("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();

        mahasiswa18 mhs3 = new mahasiswa18(
            "Nabila Ardianti Lunetta",
            "254107060094",
            4.00,
            "SIB 1E"
        );
    }
}
