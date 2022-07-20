package Solution;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

public class SolutionTest {

    private static final double DELTA = 1e-15;

    @Test
    public void testSomething() {
        assertEquals(1, Solution.find_average(new int[]{1,1,1}), DELTA);
        assertEquals(2, Solution.find_average(new int[]{1, 2, 3}), DELTA);
        assertEquals(0, Solution.find_average(new int[]{}), DELTA);
        assertEquals(2, Solution.find_average(new int[]{1, 2, 3, 4, 0}), DELTA);
    }

    @Test
    public void testSomething2() {
        assertEquals(Solution.check(new Object[] {66, 101}, 66), true);
        assertEquals(Solution.check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45), true);
        assertEquals(Solution.check(new Object[] {'t', 'e', 's', 't'}, 'e'), true);
        assertEquals(Solution.check(new Object[] {"what", "a", "great", "kata"}, "kat"), false);
    }

    @Test
    public void validate() {
        assertEquals("Bilal Djaghout", Solution.smash(new String[] { "Bilal", "Djaghout" }));
    }

    @Test
    public void validateEmpty() {
        assertEquals("", Solution.smash(new String[] {}));
    }

    @Test
    public void test4(){

        assertEquals(61000, Solution.Past(0,1,1));
        assertEquals(3661000, Solution.Past(1,1,1));
    }

    @Test
    public void test1() {
        System.out.println("Fixed Tests Player 1 won!");
        assertEquals("Player 1 won!", Solution.rps("rock", "scissors"));
        assertEquals("Player 1 won!", Solution.rps("scissors", "paper"));
        assertEquals("Player 1 won!", Solution.rps("paper", "rock"));
    }
    @Test
    public void test2() {
        System.out.println("Fixed Tests Player 2 won!");
        assertEquals("Player 2 won!", Solution.rps("scissors", "rock"));
        assertEquals("Player 2 won!", Solution.rps("paper", "scissors"));
        assertEquals("Player 2 won!", Solution.rps("rock", "paper"));
    }
    @Test
    public void test3() {
        System.out.println("Fixed Tests Draw!");
        assertEquals("Draw!", Solution.rps("scissors", "scissors"));
        assertEquals("Draw!", Solution.rps("paper", "paper"));
        assertEquals("Draw!", Solution.rps("rock", "rock"));
    }

    @Test
    public void testSomething5() {
        assertEquals(15, Solution.sum(new int[]{1,2,3,4,5}));
        assertEquals(13, Solution.sum(new int[]{1,-2,3,4,5}));
        assertEquals(0, Solution.sum(new int[]{}));
        assertEquals(0, Solution.sum(new int[]{-1,-2,-3,-4,-5}));
        assertEquals(9, Solution.sum(new int[]{-1,2,3,4,-5}));
    }

    @Test public void test4a() {
        assertEquals("aaaa", Solution.repeatStr(4, "a"));
    }
    @Test public void test3Hello() {
        assertEquals("HelloHelloHello", Solution.repeatStr(3, "Hello"));
    }
    @Test public void test5empty() {
        assertEquals("", Solution.repeatStr(5, ""));
    }
    @Test public void test0kata() {
        assertEquals("", Solution.repeatStr(0, "kata"));
    }

    @Test
    public void test1123() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(true, Solution.comp(a, b));
    }

    @Test
    public void test1121233() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 36100, 25921, 361, 20736, 361};
        assertEquals(false, Solution.comp(a, b));
    }

    @Test
    public void test112121231233() {
        int[] a = null;
        int[] b = new int[]{121, 14641, 20736, 36100, 25921, 361, 20736, 361};
        assertEquals(false, Solution.comp(a, b));
    }


    @Test
    public void test1222222222222222() {
        assertEquals(new ArrayList<Integer>(Arrays.asList(3, 2, 1, 1)), Solution.sqInRect(5, 3));
    }

    @Test
    public void test1213222222222222222() {
        assertEquals(new ArrayList<Integer>(Arrays.asList(2, 2, 1, 1)), Solution.sqInRect(5, 2));
    }


    @Test
    public void test22222222222222222222() {
        assertEquals(null, Solution.sqInRect(5, 5));
    }


    Solution variabonacci;

    @Before
    public void setUp() throws Exception {
        variabonacci = new Solution();
    }

    @After
    public void tearDown() throws Exception {
        variabonacci = null;
    }

    private double precision = 1e-10;

    @Test
    public void sampleTests() {
        assertArrayEquals(new double []{1,1,1,3,5,9,17,31,57,105},
                variabonacci.tribonacci(new double []{1,1,1},10), precision);
        assertArrayEquals(new double []{0,0,1,1,2,4,7,13,24,44},
                variabonacci.tribonacci(new double []{0,0,1},10), precision);
        assertArrayEquals(new double []{0,1,1,2,4,7,13,24,44,81},
                variabonacci.tribonacci(new double []{0,1,1},10), precision);
    }

    private static void testing(long a, long b, long[] res) {
        assertEquals(Arrays.toString(res),
                Arrays.toString(Solution.sumDigPow(a, b).toArray()));
    }

    @Test
    public void test() {
        System.out.println("Basic Tests");
        testing(1, 10, new long[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
        testing(1, 100, new long[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 89});
        testing(10, 100,  new long[] {89});
        testing(90, 100, new long[] {});
        testing(90, 150, new long[] {135});
        testing(50, 150, new long[] {89, 135});
        testing(10, 150, new long[] {89, 135});
    }


    @Test
    public void testerwwwwwwwwwww() {
        assertEquals(3,Solution.findEvenIndex(new int[] {1,2,3,4,3,2,1}));
        assertEquals(1,Solution.findEvenIndex(new int[] {1,100,50,-51,1,1}));
        assertEquals(-1,Solution.findEvenIndex(new int[] {1,2,3,4,5,6}));
        assertEquals(3,Solution.findEvenIndex(new int[] {20,10,30,10,10,15,35}));
        assertEquals(-1,Solution.findEvenIndex(new int[] {-8505, -5130, 1926, -9026}));
        assertEquals(1,Solution.findEvenIndex(new int[] {2824, 1774, -1490, -9084, -9696, 23094}));
        assertEquals(6,Solution.findEvenIndex(new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));
    }

    @Test
    public void testBasic() {
        assertFalse(Solution.isPrime(0), "0  is not prime");
        assertFalse(Solution.isPrime(1), "1  is not prime");
        assertTrue ("2  is prime",     Solution.isPrime(2));
        assertTrue ("73 is prime",     Solution.isPrime(73));
        assertFalse(Solution.isPrime(75), "75 is not prime");
        assertFalse(Solution.isPrime(-1), "-1 is not prime");
    }

    @Test
    public void testPrime() {
        assertTrue("3 is prime", Solution.isPrime(3));
        assertTrue("5 is prime", Solution.isPrime(5));
        assertTrue("7 is prime", Solution.isPrime(7));
        assertTrue("41 is prime", Solution.isPrime(41));
        assertTrue("5099 is prime", Solution.isPrime(5099));
    }

    @Test
    public void testNotPrime() {
        assertFalse(Solution.isPrime(4), "4 is not prime");
        assertFalse(Solution.isPrime(6), "6 is not prime");
        assertFalse(Solution.isPrime(8), "8 is not prime");
        assertFalse(Solution.isPrime(9), "9 is not prime");
        assertFalse(Solution.isPrime(45), "45 is not prime");
        assertFalse(Solution.isPrime(-5), "-5 is not prime");
        assertFalse(Solution.isPrime(-8), "-8 is not prime");
        assertFalse(Solution.isPrime(-41), "-41 is not prime");
        assertFalse(Solution.isPrime(1111111111), "-41 is not prime");
    }

    @Test
    public void testGame() {
        assertEquals(5, Solution.countBits(1234));
        assertEquals(1, Solution.countBits(4));
        assertEquals(3, Solution.countBits(7));
        assertEquals(2, Solution.countBits(9));
        assertEquals(2, Solution.countBits(10));
    }

    @Test
    public void tessdasdt1() {
        List<String> a = new ArrayList<String>();
        a.add(":)"); a.add(":D"); a.add(":-}"); a.add(":-()");
        assertEquals(2, Solution.countSmileys(a));
    }

    @Test
    public void tesadasdst2() {
        List<String> a = new ArrayList<String>();
        a.add(":)"); a.add("XD"); a.add(":0}"); a.add("x:-"); a.add("):-"); a.add("D:");
        assertEquals(1, Solution.countSmileys(a));
    }

    @Test
    public void teasdsadst4() {
        List<String> a =  new ArrayList<String>();
        a.add(":)"); a.add(":D"); a.add("X-}"); a.add("xo)"); a.add(":X"); a.add(":-3"); a.add(":3");
        assertEquals(2, Solution.countSmileys(a));
    }

    @Test
    public void teasasdst5() {
        List<String> a =  new ArrayList<String>();
        a.add(":)"); a.add(":)"); a.add("x-]"); a.add(":ox"); a.add(";-("); a.add(";-)"); a.add(";~("); a.add(":~D");
        assertEquals(4, Solution.countSmileys(a));
    }


//    @Test
//    public void exampleTest() {
//        int[][] sudoku = {
//                {5, 3, 4, 6, 7, 8, 9, 1, 2},
//                {6, 7, 2, 1, 9, 5, 3, 4, 8},
//                {1, 9, 8, 3, 4, 2, 5, 6, 7},
//                {8, 5, 9, 7, 6, 1, 4, 2, 3},
//                {4, 2, 6, 8, 5, 3, 7, 9, 1},
//                {7, 1, 3, 9, 2, 4, 8, 5, 6},
//                {9, 6, 1, 5, 3, 7, 2, 8, 4},
//                {2, 8, 7, 4, 1, 9, 6, 3, 5},
//                {3, 4, 5, 2, 8, 6, 1, 7, 9}
//        };
//        assertTrue(Solution.check(sudoku));
//
//        sudoku[0][0]++;
//        sudoku[1][1]++;
//        sudoku[0][1]--;
//        sudoku[1][0]--;
//
//        assertFalse(Solution.check(sudoku));
//
//        sudoku[0][0]--;
//        sudoku[1][1]--;
//        sudoku[0][1]++;
//        sudoku[1][0]++;
//
//        sudoku[4][4] = 0;
//
//        assertFalse(Solution.check(sudoku));
//    }


}
