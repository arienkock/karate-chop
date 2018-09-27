package systems.worth;

import static org.junit.Assert.*;

public class KarateChopTest {

    @org.junit.Test
    public void search() {
//        assertEquals(KarateChop.search(1, new int[] {0,1,2,3,4}), 1);
//        assertEquals(KarateChop.search(9, new int[] {0,1,2,3,4}), -1);
//        assertEquals(KarateChop.search(0, new int[] {0,1,2,3,4}), 0);
//        assertEquals(KarateChop.search(4, new int[] {0,1,2,3,4}), 4);
//        assertEquals(KarateChop.search(3, new int[] {0,1,2,3,4}), 3);
//
//        assertEquals(KarateChop.search(3, new int[0]), -1);
//        assertEquals(KarateChop.search(3, new int[] {0,1,2,3}), 3);
        assertEquals(KarateChop.search(0, new int[] {0}), 0);
        assertEquals(KarateChop.search(0, new int[] {0,5,6,7,8,9}), 5);
    }
}