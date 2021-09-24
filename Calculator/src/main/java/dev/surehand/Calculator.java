package dev.surehand;

public class Calculator {

    public Calculator(double a, double b) {
    }

    public double getAddition(double a, double b) {
        return a + b;
    }

    public double getSubtraction(double a, double b) {
        return a - b;
    }

    public double getMultiplication(double a, double b) {
        return a * b;
    }

    public double getDivision(double a, double b) {
        return a / b;
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
        System.out.println("            Type: double. Type int will be converted to type double.");

    }
}
