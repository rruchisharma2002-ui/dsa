package Java.Variables;

import java.util.Arrays;

public class datatypes {
    public static void main(String[] args) {

        // ==============================
        // 1. Primitive Data Types
        // ==============================
        // Primitive types are built-in data types in Java.
        // They store simple values directly in memory.

        byte age = 25;                 // small integer (-128 to 127)
        short marks = 450;             // small integer (-32768 to 32767)
        int salary = 50000;            // most commonly used integer type
        long population = 1400000000L; // large integer value
        float percentage = 87.5f;      // decimal with single precision
        double price = 9999.99;        // decimal with double precision
        char grade = 'A';              // single character
        boolean isStudent = true;      // true or false

        System.out.println("=== Primitive Data Types ===");
        System.out.println("byte ageh = " + age);
        System.out.println("short marks = " + marks);
        System.out.println("int salary = " + salary);
        System.out.println("long population = " + population);
        System.out.println("float percentage = " + percentage);
        System.out.println("double price = " + price);
        System.out.println("char grade = " + grade);
        System.out.println("boolean isStudent = " + isStudent);

        // ==============================
        // 2. Non-Primitive Data Types
        // ==============================
        // Non-primitive types are created by the programmer or are built-in reference types.
        // They can store more complex data and usually have methods.

        String name = "Ruchi";        // String is a class, not a primitive type

        int[] numbers = {10, 20, 30, 40, 50};  // Array

        System.out.println("\n=== Non-Primitive Data Types ===");
        System.out.println("String name = " + name);
        System.out.println("Array numbers = " + Arrays.toString(numbers));

        // Object example
        Student student = new Student();
        student.name = "Ruchi";
        student.age = 20;

        System.out.println("Student name = " + student.name);
        System.out.println("Student age = " + student.age);
        student.study();

        // ==============================
        // 3. Simple Explanation
        // ==============================
        System.out.println("\nSimple Meaning:");
        System.out.println("Primitive = simple values like numbers, letters, true/false");
        System.out.println("Non-primitive = String, Array, Object, Class, Interface etc.");
    }
}

// ==============================
// Class Example
// ==============================
class Student implements Learning {
    String name;
    int age;

    public void study() {
        System.out.println("\nInterface Example:");
        System.out.println(name + " is studying Java.");
    }
}

// ==============================
// Interface Example
// ==============================
interface Learning {
    void study();
}

