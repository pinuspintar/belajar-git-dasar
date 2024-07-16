public class IfandElseStatement {
    public static void main(String[] args) {
        
        var nilai = 95; // kalau nilai dan absen true maka if akan dieksekusi
        var absen = 80; // kalau salah satu false maka else yg akan dieksekusi

        if(nilai >= 75 && absen >=75){
            System.out.println("selamat anda lulus");
        }
        else{
            System.out.println("silahkan coba lagi tahun depan");
        }
    }
    
}
