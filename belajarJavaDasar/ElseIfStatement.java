public class ElseIfStatement {
    public static void main(String[] args) {

        var nilai = 95;
        var absen = 90;
        
        if (nilai >= 90 && absen >= 90){
            System.out.println("nilai anda A");
        } else if (nilai >=80 && absen >=80){
            System.out.println("nilai anda B");
        } else if (nilai >= 75 && absen >= 75){
            System.out.println("nilai anda C");
        } else if (nilai >= 70 && absen >=70){
            System.out.println("nilai anda D");
        } else {
            System.out.println("nilai anda E");
        }
    }
    
}
