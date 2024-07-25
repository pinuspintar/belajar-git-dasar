public class MethodVariableArgument {
    public static void main(String[] args) {
        
        int[] values = {80, 90, 85, 85};
        sayCongrats("Rafi", values);

    }  
    
    static void sayCongrats(String name, int[] values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("selamat " + name + ", Anda Lulus");
        }else {
            System.out.println("maaf " + name + ", Anda tidak lulus");
        }
    }
    
}
