public class Main{
    public static void main(String[] args) throws Exception {
        printSquare(1, 5);
        printSquare(3, 9);
        printSquare(0, 3);
        printSquare(5, 5);
    }

    public static void printSquare(int start, int end) {
        for (int r = start; r <= end; r++) {
            for (int c = r; c <= end; c++) {
                System.out.print(c);
            }
            for (int c = start; c < r; c++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

/*
BJP5 Exercise 3.4: printSquare

Write a method called printSquare that takes in two integer parameters, 
a min and a max, and prints the numbers in the range from min to max 
inclusive in a square pattern. The square pattern is easier to understand 
by example than by explanation, so take a look at the sample method calls 
and their resulting console output in the table below.
Each line of the square consists of a circular sequence of increasing integers 
between min and max. Each line prints a different permutation of this sequence. 
The first line begins with min, the second line begins with min + 1, and so on. 
When the sequence in any line reaches max, it wraps around back to min.
You may assume the caller of the method will pass a min and a max parameter 
such that min is less than or equal to max.

Example calls and their output:
printSquare(1, 5);
12345
23451
34512
45123
51234

printSquare(3, 9);
3456789
4567893
5678934
6789345
7893456
8934567
9345678

printSquare(0, 3);
0123
1230
2301
3012

printSquare(5, 5);
5

*/
