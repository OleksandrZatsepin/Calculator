package dev.surehand;

public class Main {
    public static void main(String[] args) {

        double[] x = {0.0, 0.0};
        int ex = 0;

        Calculator calculator = new Calculator();

        if (args.length == 3) {
            for (int i=1; i < args.length; i++) {
                try {
                    x[i-1] = Double.parseDouble(args[i]);
                } catch (Exception e) {
                    System.out.println("Incorrect argument: " + args[i]);
                    ex = 1;
                }
            }
            switch (args[0]) {
                case "-a":
                    System.out.println(args[1] + " + " + args[2] + " = " + calculator.add(x[0], x[1]));
                    break;
                case "-d":
                    System.out.println(args[1] + " / " + args[2] + " = " + calculator.divide(x[0], x[1]));
                    break;
                case "-m":
                    System.out.println(args[1] + " * " + args[2] + " = " + calculator.multiply(x[0], x[1]));
                    break;
                case "-s":
                    System.out.println(args[1] + " - " + args[2] + " = " + calculator.subtract(x[0], x[1]));
                    break;
                default:
                    System.out.println("Incorrect command: " + args[0]);
                    ex = 1;
            }
        } else {
            System.out.println("Wrong number of arguments: " + args.length);
            ex =1;
        }

        if (ex == 1) {
            calculator.usage();
        }

    }
}
