package systems.worth;

import static org.junit.Assert.*;

public class KarateChopTest {

    @org.junit.Test
    public void search() {
        assertEquals(KarateChop.search(1, new int[] {0,1,2,3,4}), 1);
        assertEquals(KarateChop.search(9, new int[] {0,1,2,3,4}), -1);
        assertEquals(KarateChop.search(0, new int[] {0,1,2,3,4}), 0);
        assertEquals(KarateChop.search(4, new int[] {0,1,2,3,4}), 4);
        assertEquals(KarateChop.search(3, new int[] {0,1,2,3,4}), 3);

        assertEquals(KarateChop.search(3, new int[0]), -1);
        assertEquals(KarateChop.search(3, new int[] {0,1,2,3}), 3);
        assertEquals(KarateChop.search(2, new int[] {0,1,2,3}), 2);
        assertEquals(KarateChop.search(1, new int[] {0,1,2,3}), 1);
        assertEquals(KarateChop.search(0, new int[] {0,1,2,3}), 0);
        assertEquals(KarateChop.search(0, new int[] {0}), 0);
    }

    @org.junit.Test
    public void searchRecurse() {
        assertEquals(KarateChop.searchRecurse(1, new int[] {0,1,2,3,4}), 1);
        assertEquals(KarateChop.searchRecurse(9, new int[] {0,1,2,3,4}), -1);
        assertEquals(KarateChop.searchRecurse(0, new int[] {0,1,2,3,4}), 0);
        assertEquals(KarateChop.searchRecurse(4, new int[] {0,1,2,3,4}), 4);
        assertEquals(KarateChop.searchRecurse(3, new int[] {0,1,2,3,4}), 3);
        assertEquals(KarateChop.searchRecurse(3, new int[0]), -1);
        assertEquals(KarateChop.searchRecurse(3, new int[] {0,1,2,3}), 3);
        assertEquals(KarateChop.searchRecurse(2, new int[] {0,1,2,3}), 2);
        assertEquals(KarateChop.searchRecurse(1, new int[] {0,1,2,3}), 1);
        assertEquals(KarateChop.searchRecurse(0, new int[] {0,1,2,3}), 0);
        assertEquals(KarateChop.searchRecurse(0, new int[] {0}), 0);
    }
}