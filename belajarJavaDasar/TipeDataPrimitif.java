public class TipeDataPrimitif {
    public static void main(String[] args) {
        
        int umur = 18;

        Integer umurObject = umur;

        int umurLagi = umurObject;

        short shortUmur = umurObject.shortValue();
        byte byteUmur = umurObject.byteValue();

        System.out.println(umurLagi);
        System.out.println(shortUmur);
        System.out.println(byteUmur);

    }
    
}
