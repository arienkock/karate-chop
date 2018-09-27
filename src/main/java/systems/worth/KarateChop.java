package systems.worth;

public class KarateChop {
    public static int search(int target, int[] array) {
        int result = -1;
        int start = 0;
        int limit = array.length;
        while (limit - start > 0) {
            int middleIndex = (limit + start) / 2;
            int middleValue = array[middleIndex];
            if (middleValue == target) {
                result = middleIndex;
                break;
            }
        }
        return result;
    }
}
