public class SwitchYield {
    public static void main(String[] args) {
        
        var nilai = "A";
        String ucapan = switch (nilai) {
            case "A":
             yield "selamat anda lulus dengan baik";
            case "B":
             yield "selamat anda lulus";
            case "D":
             yield "anda tidak lulus";
            default:
             yield "mungkin anda salah jurusan";

        };
        System.out.println(ucapan);

    }
    
}
