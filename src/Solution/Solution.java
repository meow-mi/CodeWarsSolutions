package Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class Solution{

    public static double find_average(int[] array) {
        if (array.length == 0) return 0;
        return Arrays.stream(array).average().getAsDouble();
    }

    public static boolean check(Object[] a, Object x) {
        // Your code here
        for (Object o : a) {
            if (o.equals(x)) return true;
        }
        return false;
    }

    public static String smash(String... words) {
        // TODO Write your code below this comment please
        String s = "";
        for (String word : words) {
            if (s.equals("")) s += word;
            else s += " " + word;
        }
        return s;
    }

    public static int Past(int h, int m, int s) {
        //Happy Coding! ^_^
        return ((h * 60 + m) * 60 + s) * 1000;
    }

    public static String rps(String p1, String p2) {
        // your code
        if (p1.equals("scissors") && p2.equals("paper")) return "Player 1 won!";
        if (p1.equals("paper") && p2.equals("scissors")) return "Player 2 won!";
        if (p1.equals("rock") && p2.equals("scissors")) return "Player 1 won!";
        if (p1.equals("scissors") && p2.equals("rock")) return "Player 2 won!";
        if (p1.equals("paper") && p2.equals("rock")) return "Player 1 won!";
        if (p1.equals("rock") && p2.equals("paper")) return "Player 2 won!";
        return "Draw!";
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i > 0) sum += i;
        }
        return sum;
    }

    public static String repeatStr(final int repeat, final String string) {
        String s = "";
        for (int i = 0; i < repeat; i++) {
            s += string;
        }
        return s;
    }

    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null) {
            return false;
        }
        int[] aa = Arrays.stream(a).map(n -> n * n).toArray();
        Arrays.sort(aa);
        Arrays.sort(b);


        return Arrays.equals(aa, b);
    }


    public static List<Integer> sqInRect(int lng, int wdth) {
        // your code
        if (lng == wdth) return null;
        ArrayList<Integer> list = new ArrayList<>();
        int l = lng;
        int w = wdth;
        while (true) {
            if (l > w) {
                l = l - w;
                list.add(w);
                System.out.println(w);
            }
            if (w > l) {
                w = w - l;
                list.add(l);
                System.out.println(l);
            }
            if (w == l) {
                list.add(w);
                System.out.println(w);
                return list;
            }
        }
    }

    public double[] tribonacci(double[] s, int n) {
        // hackonacci me
        double[] arr  = Arrays.copyOf(s, n);

        for (int i = 3; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
        }

        return arr;
    }

    public static List<Long> sumDigPow(long a, long b) {
        // your code
        List<Long> list = new ArrayList<>();
        for (long i = a; i < b; i++) {

            String s = Long.toString(i);

            char[] chars = s.toCharArray();
            int[] arr = new int[chars.length];

            for (int j = 0; j < chars.length; j++) {
                arr[j] = chars[j] - 48;
            }

            long num = 0;
            for (int j = 0; j < arr.length; j++) {
                num += Math.pow(arr[j], (j + 1));
            }
            if (num == i) list.add(i);


        }

        return list;
    }

    public static int findEvenIndex(int[] arr) {
        // your code
        int num = -1;
        for (int i = 0; i < arr.length; i++) {
            int sumLeft = 0;
            for (int j = 0; j < i; j++) {
                sumLeft += arr[j];
            }
            int sumRight = 0;
            for (int j = i + 1; j < arr.length; j++) {
                sumRight += arr[j];
            }
            if (sumLeft == sumRight) {
                num = i;
                break;
            }

        }
        return num;
    }

    public static boolean isPrime(int num) {

        if (num == 2) return true;
        if (num > 2) {
            int div = 2;

            while (div < Math.sqrt(num) + 1) {

                if (num % div == 0) {
                    return false;
                }
                div++;
            }


        } else return false;
        return true;
    }

    public static int countBits(int n) {
        // Show me the code!
        return Integer.bitCount(n);
    }


    public static int countSmileys(List<String> arr) {
        // Just Smile :)
        int num = 0;
        for (String s : arr) {
            char[] chars = s.toCharArray();

            if (chars.length < 2 || chars.length > 3) {
                continue;
            }

            if (chars[0] == ';' || chars[0] == ':') {
            } else {
                continue;
            }


            if (chars.length == 3) {
                if (chars[1] == '~' || chars[1] == '-') {
                } else continue;
            }


            if (chars[chars.length - 1] == ')' || chars[chars.length - 1] == 'D') {
            } else continue;


            num++;
        }
        return num;
    }

    
    // REMEAKE WITH SUMM OF 1-9 numbers
    public static boolean check(int[][] sudoku) {
        //do your magic
        boolean status = false;

        int[] sq3x3;

        // horizontal
        for (int i = 0; i < 9; i++) {
            int [] line = new int[9];
            for (int j = 0; j < 9; j++) {
                line[j] = sudoku[i][j];
            }
            status = sortArraySudoku(line);
            if (!status) return false;
        }

        // vertical
        for (int i = 0; i < 9; i++) {
            int [] line = new int[9];
            for (int j = 0; j < 9; j++) {
                line[j] = sudoku[j][i];
            }
            status = sortArraySudoku(line);
            if (!status) return false;
        }

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                status = sortArray3x3Sudoku(sudoku,i*3, j*3);
                if (!status) return false;
            }
        }


        return true;
    }

    public static boolean sortArraySudoku(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {

                if (arr[i] == 0) {
                    return false;
                }
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sortArray3x3Sudoku(int[][] sudoku, int hor, int ver) {
        int [] line = new int[9];
        int count = 0;
        for (int i = hor; i < hor+3; i++) {
            for (int j = ver; j < ver+3; j++) {
                line[count] = sudoku[i][j];
                count++;
            }
        }
        for (int i : line) {
            System.out.print(i + " ");
        }
        System.out.println();
        return sortArraySudoku(line);
    }

}
