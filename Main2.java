public class Main2 {
    public static void main(String[] args) {
        int[] intArray = new int[]{2,4,5,6,7,5,3,6,5};
        try {
            int d = 2;
            double catchedRes1 =  intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("Catching exception: " + e);
        }

    }
}
