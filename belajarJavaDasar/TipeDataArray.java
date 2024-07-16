public class TipeDataArray {
    public static void main(String[] args) {
        
        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "muhammad";
        arrayString[1] = "rafi";
        arrayString[2] = "aziz";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);
        
        String[][] members = {
            {"rafi", "aziz"},
            {"syafa", "azzahra"},
            {"faiq"}
        };
        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
        System.out.println(members[0][0]);
    }
    
}
