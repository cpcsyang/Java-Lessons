
public class App {
    public static void main(String[] args) { 
        System.out.println("varargs demo");
        int[] intArr = {1, 2, 3};
        
        printVarargs(intArr);
        printVarargs(4);
        printVarargs();
        printVarargs(5, 6);
        printVarargs(new int[]{7, 8, 9});

        printArr(intArr);
        // printArr(4);         // This will have compile error
        // printArr();          // This will have compile error
        // printArr(5, 6);      // This will have compile error
        printArr(new int[]{7, 8, 9});

        System.out.println("completed.");
    }

    public static void printVarargs(int... intArr) {
        for (int n : intArr) System.out.print(n);
        System.out.println();
    }

    public static void printArr(int[] intArr) {
        for (int n : intArr) System.out.print(n);
        System.out.println();
    }
}

/*
* String... is varargs
* String[] is array
* 
* References:
* https://stackoverflow.com/questions/11973505/what-is-the-difference-between-string-and-string-in-java
* https://www.baeldung.com/java-varargs
* https://docs.oracle.com/javase/8/docs/technotes/guides/language/varargs.html
* https://www.geeksforgeeks.org/variable-arguments-varargs-in-java/
* 
*/
