package opgave02;

public class Opgave02 {
    public static void main(String[] args) {

        System.out.println("Opgave 1:");
        int[] intArray1 = {23, 8, 202, -13, 42, 6, 53, 17, 22};
        udprintMetode(swap(intArray1));

        System.out.println("Opgave 2:");
        int[] intArray2 = {23, 8, 202, -13, 42, 6, 53, 17, 22};
        udprintMetode(lige(intArray2));

        System.out.println("Opgave 3:");
        int[] intArray3 = {23, 8, 202, -13, 42, 6, 53, 17, 22};
        System.out.println(mindste(intArray3));
        System.out.println();

        System.out.println("Opgave 4:");
        int[] intArray4 = {23, 8, 202, -13, 42, 6, 53, 17, 22};
        System.out.println(mindstePlacering(intArray4));
    }

    public static void udprintMetode(int[] ints) {
        for (int ingerArray : ints) {
            System.out.print(ingerArray + ",");
        }
        System.out.println();
        System.out.println();
    }

    public static int[] swap(int[] intArray) {
        int temp = intArray[0];
        intArray[0] = intArray[intArray.length - 1];
        intArray[intArray.length - 1] = temp;
        return intArray;
    }
    public static int[] lige(int[] intArray){
        for (int i = 0; i < intArray.length ; i++) {
            if (intArray[i]%2==0){
                intArray[i]=0;
            }
        }
        return intArray;
    }
    public static int mindste(int[]intArray){
        int min=intArray[0];
        for (int i = 0; i <intArray.length ; i++) {
            if (intArray[i]<min) {
                min=intArray[i];
            }
        }
        return min;
    }

    public static int mindstePlacering (int[]intArray){
        int min=intArray[0];
        int placering=0;
        for (int i = 0; i <intArray.length ; i++) {
            if (intArray[i]<min) {
                min=intArray[i];
                placering=i;
            }
        }
        return placering;
    }
//    public static int skubTal (int[]intArray){
//        int skubArray=0
//    }
}
