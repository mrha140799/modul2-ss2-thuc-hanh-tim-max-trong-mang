package SS2TH3;

public class FindValueMax {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("Max = " + findValueMax(array));
    }
    private static int findValueMax(int array[]) {
        int max = array[0];
        for (int i = 1 ; i < array.length ; i++ ) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return  max;

    }
}
