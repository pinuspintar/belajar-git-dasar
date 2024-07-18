public class Break {
    public static void main(String[] args) {
        
        var bakso = 1;

        while(true){
            System.out.println("perulangan" + bakso);
            bakso++;

            if (bakso > 10){
                break;
            }
        }
    }
    
}
