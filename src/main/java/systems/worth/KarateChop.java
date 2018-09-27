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

            if(middleValue > target){
                limit = middleIndex;
            }
            if(middleValue < target){
                start = middleIndex + 1;
            }
        }
        return result;
    }
}
