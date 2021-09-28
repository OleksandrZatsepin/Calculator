package dev.surehand;

public class Calculator {
    private final int n = 14;

    public Calculator() {
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public long multiply(int a, int b) {
        return (long) a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public double add(double a, double b) {
        return roundN(a + b, n);
    }

    public double subtract(double a, double b) {
        return roundN(a - b, n);
    }

    public double multiply(double a, double b) {
        return roundN(a * b, n);
    }

    public double divide(double a, double b) {
        return ((b == 0) ? a / b : roundN(a / b, n));
    }

    private double roundN(double a, int n) {
        return Math.round(a * Math.pow(10, n)) / Math.pow(10, n);
    }

    public void usage() {
        System.out.println("\nUSAGE of Calculator\n");
        System.out.println("SYNOPSIS");
        System.out.println("     -command argument1 argument2\n");
        System.out.println("DESCRIPTION");
        System.out.println("Performs basic math operations on two arguments.");
        System.out.println("The extended version (argument1 sign argument2 sign argument3 ...) will be soon, maybe.\n");
        System.out.println("OPTIONS");
        System.out.println("     -a     Adds two arguments: argument1 + argument2");
        System.out.println("     -d     Divides argument1 by argument2: argument1 / argument2");
        System.out.println("     -m     Multiplies two arguments: argument1 * argument2");
        System.out.println("     -s     Subtracts argument2 from argument1: argument1 - argument2");
        System.out.println("Any other command or the absence of at least one of the arguments brings up this help screen.\n");
        System.out.println("ARGUMENTS");
        System.out.println("     argument1, argument2");
        System.out.println("If at least one argument is of type double, the result will also be of type double.");
        System.out.println("Division of an integer by an integer is an integer, the remainder of the division is discarded. \nFor example, 5/2 = 2.");
    }
}
