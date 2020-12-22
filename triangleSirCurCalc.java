package com.company;

import java.util.Scanner;

class triangleSurface {
    public static void staticMethod() {
        Scanner input = new Scanner(System.in);
        int baseTriangle;
        System.out.print("\nWhat is your base in cm: ");
        baseTriangle = input.nextInt();
        int heightTriangle;
        System.out.print("\nWhat is your height in cm: ");
        heightTriangle = input.nextInt();
        int surfaceTriangleAll;
        System.out.print("\nThe surface is " + baseTriangle * heightTriangle + " cm²\n");
    }
}

class triangleCircumference {
    public static void StaticMethod() {
        Scanner input = new Scanner(System.in);
        int firstLine;
        System.out.print("\nFirst Line: ");
        firstLine = input.nextInt();
        int secondLine;
        System.out.print("Second line: ");
        secondLine = input.nextInt();
        int thirdLine;
        System.out.print("Third line: ");
        thirdLine = input.nextInt();
        int triangleCircumferenceAdd = firstLine + secondLine + thirdLine;
        System.out.print("\nThe circumference is " + triangleCircumferenceAdd + " cm\n");
    }
}

class exitProgram {
    public static void staticMethod() {
        System.exit(1);
    }
}

public class indexProgram {
    public static void main(String []args) {
        while(true) {
            Scanner input = new Scanner(System.in);
            Integer question;
            System.out.print("\nDo you want to calculate the 1.(surface) or 2.(circumference) of a triangle: ");
            question = input.nextInt();
            if (question.equals(1)) {
                triangleSurface.staticMethod();
            } else if (question.equals(2)) {
                triangleCircumference.StaticMethod();
            } else {
                exitProgram.staticMethod();
            }
        }
    }
}
