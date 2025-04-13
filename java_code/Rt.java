/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class Rt
extends rg_0 {
    private static final Logger a = Logger.getLogger(rc_0.class);
    private float[] b = new float[4];
    private String c;

    @Override
    protected boolean a(String string) {
        try {
            String[] stringArray = Cz.a(string, ';');
            if (stringArray == null || stringArray.length != 4 && stringArray.length != 5) {
                a.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", pas assez de param\u00e8tres (il en faut 5 : partName;R;G;B;A (couleur entre [0-1]) : " + string));
                return false;
            }
            this.c = stringArray[0];
            float f2 = Float.parseFloat(stringArray[1]);
            float f3 = Float.parseFloat(stringArray[2]);
            float f4 = Float.parseFloat(stringArray[3]);
            float f5 = stringArray.length == 4 ? 1.0f : Float.parseFloat(stringArray[4]);
            this.b = new float[]{f2 * f5, f3 * f5, f4 * f5, f5};
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            a.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", mauvaise saisi des param\u00e8tres  : " + string));
            return false;
        }
    }

    @Override
    public ri_0 a() {
        return ri_0.g;
    }

    public float[] e() {
        return this.b;
    }

    public String f() {
        return this.c;
    }
}

