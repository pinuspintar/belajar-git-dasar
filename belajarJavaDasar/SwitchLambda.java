public class SwitchLambda {
    public static void main(String[] args) {
        
        var nilai = "E";

    switch (nilai){
        case "A" -> System.out.println("selamat anda lulus dengan baik");
        case "B", "C" -> System.out.println("selamat anda lulus");
        case "D" -> System.out.println("anda tidak lulus");
        default -> {
            System.out.println("mungkin anda salah jurusan");
        }
    }
    }
    
}
