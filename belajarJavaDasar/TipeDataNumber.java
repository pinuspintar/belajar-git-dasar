public class TipeDataNumber {
    
    public static void main(String[] args) {
      
        byte iniByte = 100;       // byte dapat menyimpan nilai antara -128 hingga 127
        short iniShort = 1000;    // short dapat menyimpan nilai antara -32,768 hingga 32,767
        int iniInt = 1000000;     // int dapat menyimpan nilai antara -2^31 hingga 2^31-1
        long iniLong = 1000000;   // long dapat menyimpan nilai antara -2^63 hingga 2^63-1
        long iniLong2 = 1000000L; // penggunaan akhiran 'L' adalah opsional dalam kasus ini, tetapi merupakan praktik yang baik untuk nilai long

        float iniFloat = 10.10F;
        double iniDouble = 10.10;

        int decimalInt = 34;
        int hexaDecimal = 0xFFFFFF;
        int binaryDecimal = 0b10101010;

        int amount = 1_000_000_000;

        System.out.println(iniByte);
        System.out.println(iniShort);
        System.out.println(iniInt);
        System.out.println(iniLong);
        System.out.println(iniLong2);
        System.out.println(iniFloat);
        System.out.println(iniDouble);
        System.out.println(decimalInt);
        System.out.println(hexaDecimal);
        System.out.println(binaryDecimal);
        System.out.println(amount);



     }
}
