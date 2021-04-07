package com.FirstJavaSteps;

public class Main {

    public static void main(String[] args) {
	    int result = 8 + 2;
	    double doubleResult = (double)10 / 3;
	    // In Java the division between whole numbers results in a whole number
	    // to print the result of a double or float at least 1 operand must be casted to that type
        // 8 is prefixed with (double) to denote that it is being casted

        int x = 1;
        int y = x++;
        //int y = ++x;
        // Increment operator ++ can be postfix or prefix. as postfix x value will be stored to y
        // Then x value will be incremented by one.
        // Prefix increment will increment the value of x first then store the value to y.

        int z = 1;
        z += 2;
        // z = z + 2
        // += is a augmented/compounded operator. A way to quickly perform short arithmetic with a variable
        // And update its value.
        // line 20 and line 21 will result in the same value.
        System.out.println(result);
        System.out.println(doubleResult);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
