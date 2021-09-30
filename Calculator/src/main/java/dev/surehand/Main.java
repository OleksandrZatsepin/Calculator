package dev.surehand;

public class Main {
    public static void main(String[] args) {

//        int[] intArgs = {0, 0};
        double[] x = {0.0, 0.0};
        boolean ex = false;

        Calculator calc = new Calculator();
        Benchmark bench = new Benchmark();

        if (args.length == 3) {
            for (int i = 1; i < args.length; i++) {
//                try {
//                    intArgs[i - 1] = Integer.parseInt(args[i]);
//                } catch (Exception e) {
                    try {
                        x[i-1] = Double.parseDouble(args[i]);
                    } catch (Exception e1) {
                        System.out.println("Incorrect argument: " + args[i]);
                        ex = true;
                    }
//                }
            }
            switch (args[0]) {
                case "-a":
                    System.out.println(args[1] + " + " + args[2] + " = " + calc.add(x[0], x[1]));
                    break;
                case "-d":
                    System.out.println(args[1] + " / " + args[2] + " = " + calc.divide(x[0], x[1]));
                    break;
                case "-m":
                    System.out.println(args[1] + " * " + args[2] + " = " + calc.multiply(x[0], x[1]));
                    break;
                case "-s":
                    System.out.println(args[1] + " - " + args[2] + " = " + calc.subtract(x[0], x[1]));
                    break;
                case "-ab":
                    System.out.println(args[1] + " + " + args[2] + " = " + calc.add(x[0], x[1]));
                    System.out.println("The operation time is " + bench.getAddTime() + " nano sec.");
                    break;
                case "-db":
                    System.out.println(args[1] + " / " + args[2] + " = " + calc.divide(x[0], x[1]));
                    System.out.println("The operation time is " + bench.getSubtractTime() + " nano sec.");
                    break;
                case "-mb":
                    System.out.println(args[1] + " * " + args[2] + " = " + calc.multiply(x[0], x[1]));
                    System.out.println("The operation time is " + bench.getMultiplyTime() + " nano sec.");
                    break;
                case "-sb":
                    System.out.println(args[1] + " - " + args[2] + " = " + calc.subtract(x[0], x[1]));
                    System.out.println("The operation time is " + bench.getDivideTime() + " nano sec.");
                    break;
                default:
                    System.out.println("Incorrect command: " + args[0]);
                    ex = true;
            }
        } else {
            System.out.println("Wrong number of arguments: " + args.length);
            ex = true;
        }

        if (ex) {
            calc.usage();
        }

    }
}
