package dev.surehand;

public class Main {
    public static void main(String[] args) {

        double[] x = {0.0, 0.0};
        int ex = 0;

        Calculator calc = new Calculator( x[0],  x[1]);

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
                    System.out.println(x[0] + " + " + x[1] + " = " + calc.getAddition(x[0], x[1]));
                    break;
                case "-d":
                    System.out.println(x[0] + " / " + x[1] + " = " + calc.getSubtraction(x[0], x[1]));
                    break;
                case "-m":
                    System.out.println(x[0] + " * " + x[1] + " = " + calc.getMultiplication(x[0], x[1]));
                    break;
                case "-s":
                    System.out.println(x[0] + " - " + x[1] + " = " + calc.getDivision(x[0], x[1]));
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
            calc.usage();
        }

    }
}
