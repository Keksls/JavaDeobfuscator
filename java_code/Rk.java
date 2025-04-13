/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class Rk
extends rg_0 {
    private static final Logger a = Logger.getLogger(Rk.class);
    private int b = 1000;
    private int c = 2000;
    private int d = 1000;
    private float e = 0.5f;
    private float f = 77.0f;
    private String g = "BOTH";

    @Override
    protected boolean a(String string) {
        try {
            String[] stringArray = Cz.a(string, ';');
            if (stringArray == null || stringArray.length > 6) {
                a.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", pas assez de param\u00e8tres (il en faut au maximum: startDuration, midDuration, endDuration, amplitude, period, [X,Y,BOTH]) : " + string));
                return false;
            }
            int n = stringArray.length;
            if (n >= 1) {
                this.b = (int)Float.parseFloat(stringArray[0]);
            }
            if (n >= 2) {
                this.c = (int)Float.parseFloat(stringArray[1]);
            }
            if (n >= 3) {
                this.d = (int)Float.parseFloat(stringArray[2]);
            }
            if (n >= 4) {
                this.e = Float.parseFloat(stringArray[3]);
            }
            if (n == 5) {
                this.f = Float.parseFloat(stringArray[4]);
            }
            if (n == 6) {
                this.g = stringArray[5].toUpperCase();
                if (this.g.equals("XY")) {
                    this.g = "BOTH";
                }
            }
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            a.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", mauvaise saisi des param\u00e8tres  : " + string));
            return false;
        }
    }

    @Override
    public ri_0 a() {
        return ri_0.e;
    }

    public int e() {
        return this.b;
    }

    public int f() {
        return this.c;
    }

    public int g() {
        return this.d;
    }

    public float h() {
        return this.e;
    }

    public float i() {
        return this.f;
    }

    public String j() {
        return this.g;
    }
}

