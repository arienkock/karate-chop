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

            if (middleValue > target) {
                limit = middleIndex;
            }
            if (middleValue < target) {
                start = middleIndex + 1;
            }
        }
        return result;
    }

    public static int searchRecurse(int target, int[] array) {
        int start = 0;
        int limit = array.length;
        return searchRecurseInner(target, array, start, limit);
    }

    public static int searchRecurseInner(int target, int[] array, int start, int limit) {
        if (start == limit) {
            return -1;
        }
        int middleIndex = (limit + start) / 2;
        int middleValue = array[middleIndex];
        if (middleValue == target) {
            return middleIndex;
        }
        if (target < middleValue) {
            return searchRecurseInner(target, array, start, middleIndex);
        }
        return searchRecurseInner(target, array, middleIndex + 1, limit);
    }
}
