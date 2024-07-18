public class Continue {
    public static void main(String[] args) {
        
        for(var bakso = 1; bakso <= 100; bakso++){
            if(bakso % 2 == 0){
            continue;            
        }
        System.out.println("perulanagan ganjil" + bakso);
        }
    }
    
}
