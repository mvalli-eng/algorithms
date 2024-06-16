package net.learningprogramming.algorithm.euclid;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class EuclidTest {

    private final Euclid e = new Euclid();

    @Test
    public void gcdTest() {
        assertEquals(2, e.gcd(10, 2));
        assertEquals(2, e.gcd(22, 6));
        assertEquals(1, e.gcd(77, 36));
    }

    @Test
    public void gcdNonRecrussionTest() {
        assertEquals(2, e.gcdNonRecrussion(10, 2));
        assertEquals(2, e.gcdNonRecrussion(22, 6));
    }

    @Test
    public void gcdVsGcdNonRecrussionTest() {
        assertEquals(e.gcd(10, 2), e.gcdNonRecrussion(10, 2));
    }
}
