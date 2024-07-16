public class OperasiBoolean {
    public static void main(String[] args) {
        
        // && = dan
        // || = atau
        // ! = kebalikan

        var nilaiUjianSekolah = 95;
        var nilaiUjianTahfidz = 100;

        boolean lulusNilaiUjianSekolah = nilaiUjianSekolah >= 70;
        boolean lulusNilaiUjianTahfidz = nilaiUjianTahfidz >= 75;

        var lulus = lulusNilaiUjianSekolah && lulusNilaiUjianTahfidz;
        System.out.println(lulus);
    }
    
}
