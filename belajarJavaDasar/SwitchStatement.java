public class SwitchStatement {
    public static void main(String[] args) {
        
        var nilai = "E";
        switch (nilai){
            case "A":
            System.out.println("selamat anda lulus dengan baik");
            break;
            case "B":
            case "C":
            System.out.println("selamat anda lulus");
            break;
            case "D":
            System.out.println("maaf anda tidak lulus");
            break;
            default:
            System.out.println("mungkin anda salah jurusan");    

        }

    }
    
}
