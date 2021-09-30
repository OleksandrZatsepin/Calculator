package dev.surehand;

public class Benchmark {

    private double a, b;
    Calculator calc;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public Benchmark(Calculator calc) {
        this.calc = calc;
    }

    public Benchmark() {
    }

    public long getAddTime() {
        long start, stop;
        calc = new Calculator();
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            calc.add(123, 456);
        }
        stop = System.nanoTime();
        return (stop - start) / 1000;
    }

    public long getSubtractTime(){
        long start, stop;
        calc = new Calculator();
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            calc.subtract(123, 456);
        }
        stop = System.nanoTime();
        return (stop - start) / 1000;
    }

    public long getMultiplyTime(){
        long start, stop;
        calc = new Calculator();
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            calc.multiply(123, 456);
        }
        stop = System.nanoTime();
        return (stop - start) / 1000;
    }

    public long getDivideTime(){
        long start, stop;
        calc = new Calculator();
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            calc.divide(123, 456);
        }
        stop = System.nanoTime();
        return (stop - start) / 1000;
    }
}
