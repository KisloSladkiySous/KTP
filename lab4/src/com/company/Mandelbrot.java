package com.company;


import java.awt.geom.Rectangle2D.Double;

public class Mandelbrot extends FractalGenerator {
    public static final int MAX_ITERATIONS = 2000;

    public Mandelbrot() {
    }

    public void getInitialRange(Double var1) {
        var1.x = -2.0D;
        var1.y = -1.5D;
        var1.width = 3.0D;
        var1.height = 3.0D;
    }

    public int numIterations(double var1, double var3) {
        int var5 = 0;
        Main var6 = new Main(var1, var3);
        Main var7 = new Main();

        do {
            var7.Squaring();
            var7.AddComlp(var6);
            ++var5;
            if (var7.SquarModul() > 4.0D) {
                return var5;
            }
        } while(var5 <= 2000);

        return -1;
    }
}
