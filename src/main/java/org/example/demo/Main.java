package org.example.demo;

import org.example.animal.Lion;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b;
    }

    static int sum(int a, int b, String c) {
        return a + b;
    }

    static float sum(int a, int b, float c) {
        return a + b;
    }

    static int calculate(int a, int b) {
        String firstName = "user name";
        int sum = firstName.length() + a + b;
        System.out.println(sum);


        {
            int insideBlock = 21;
            System.out.println(insideBlock);
        }

        return sum;
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
DayOfWeek today = DayOfWeek.TUESDAY;

        A a1 = new A();

        A.B b1 = a1.new B();

        Lion lion = new Lion("Lion Grover");
        lion.sound();
        lion.updateSound();
        lion.sound();


        sum(10);

        int calculate = calculate(2, 5);


        String name = new String("aniket");


        int sum = sum(10, 9, "aniket");

        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        System.out.println(myNumbers[0][0]);

        String test = "/de/products/something";
        String[] split = test.split("/");

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String message = "I am giving training";
        boolean isStudent = true;
        System.out.print("Hello World!");
        System.out.println("I am giving training....");
        System.out.println(message);


        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        int age = 22;
        System.out.println(" My Age is: " + age);

        String employeeName = "Sage";
        int employed = 123;
        char companyBand = 'A';
        float salary = 1200.50f;
        boolean isEmployed = true;

        // primitive - byte, short, int, float, long, double, boolean, char
        //non-prim - String, Arrays, Classes


        //byte 127,
        // short -32768 to 32767,
        //Long -
        // int -2147483648 to 2147483648

        // Java will assign less or more memory so you would choose the appropriate one to optimize the use of memory. The memory is wasted

        // diff between prim types and non-prim types

        // prim -> built into program, start with lowercase, and have to hold a value
        // non-prim -> created by programmer, can be used to call methods, can have a null value

        byte num = 7;
        byte negative = -12;

        short shortNum = 20000;

        long longNum = 2000;

        double doubleNum = 200000;

        System.out.println("short is: " + shortNum);
        System.out.println(" long is: " + longNum);
        System.out.println("double is: " + doubleNum);


        String firstName = "ani&ke&t";
        String[] thisIsTheResultOfSplitOperation = firstName.split("&");


        System.out.println(name.length());


        String fruitNames = "apple*banna*pear*mango*kiwi*plum";
        String upperCase = fruitNames.toUpperCase();
        System.out.println(upperCase);

        String[] withoutStar = upperCase.split("/*");


        byte namedVariable = 100;
        System.out.println(namedVariable);

        short shortDataTypeVariable = 80;

        long byteMinusShort = namedVariable - shortDataTypeVariable;

        System.out.println(shortDataTypeVariable);

        System.out.println(byteMinusShort);

        float floatVariable = 3.14F;
        System.out.println(floatVariable);


        String students = "Malia&Errol&T&Sage";
        String[] theArrayOfStudents = students.split("&");

        System.out.println("The count of the array is: " + theArrayOfStudents.length);

        String name1 = "goten";
        String name2 = "trunks";

        String name1plus2 = "Gotenks";
        System.out.println(name1plus2);

        String allTheStudentsName = "This does contain the word Sage ";
        boolean doesItContainTheWord = true;

//        System.out.println(doesItContainTheWord.contains("Sage") );

        String newMessage = "Hi how are you \\doing\\ and where have you been yesterday ";
//
//        newMessage.split("\\");


        int max = Math.max(10, 20);


        System.out.println(newMessage);

        int numba1 = 2;
        int numba2 = 4;

        if (numba2 > numba1) {
            System.out.println("4 is greater than 2, so numba2 > numba 1");
        } else if (numba1 > numba2) {
            System.out.println("else if condition is running");
        }
        {
            System.out.println("good morning");
        }


        // 1) Declare an integer variable with 1
        int number = 1;

        // 2) While loop - print the value and increase by 1 (up to 5 for demonstration)
        System.out.println("While loop:");
        while (number <= 5) {
            System.out.println(number);
            number++;
        }

        // 3) Do while loop - print only even numbers (up to 10 for demonstration)
        System.out.println("\nDo-while loop (even numbers):");
        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 10);

        // 4) For loop - print odd numbers from 1 to 10
        System.out.println("\nFor loop (odd numbers):");
        for (int j = 1; j <= 10; j++) {
            if (j % 2 != 0) {
                System.out.println(j);
            }
        }

        // 5) Loop from 1 to 100, multiply numbers in the 60s by 2
        System.out.println("\nNumbers from 1 to 100, 60-70 multiplied by 2:");
        for (int k = 1; k <= 100; k++) {
            if (k >= 60 && k <= 70) {
                System.out.println(k * 2);
            } else {
                System.out.println(k);
            }
        }

        // 6) Loop from 1 to 100, only even numbers printed in the 50s
        System.out.println("\n1 to 100, only even numbers from 50 to 60:");
        for (int m = 1; m <= 100; m++) {
            if (m >= 50 && m <= 60) {
                if (m % 2 == 0) {
                    System.out.println(m);
                }
            } else {
                System.out.println(m);
            }
        }

        // 7) Print 1 to 10, each number printed that many times
        System.out.println("\nRepeat numbers by their value:");
        for (int n = 1; n <= 10; n++) {
            for (int repeat = 1; repeat <= n; repeat++) {
                System.out.print(n);
            }
            System.out.println();
        }

        // 8) Shorthand if-else
        int a = 8;
        int b = 4;
        int result = ((a + b) % 2 == 0) ? (a * b) : (a / b);
        System.out.println("\nShorthand if-else result: " + result);
    }


}

//        public class LoopAssignment {
class A {
    int a = 0;
    String className = "classA";

     class B {
        int b = 2;
        String className = "classB";
    }
}